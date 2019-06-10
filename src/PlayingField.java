public class PlayingField {
    byte[][] fieldMatrix;

    public PlayingField(){
        fieldMatrix = new byte[20][10];
    }

    public void clearLines(){
        for (int i = 0; i < 20; i++){
            if(checkLine(i)){
                removeLine(i);
            }
        }
    }

    private boolean checkLine(int i){
        for (int j = 0; j < 10; j++){
            if (fieldMatrix[i][j] == 0){
                return false;
            }
        }
        return true;
    }

    private void removeLine(int i){
        fieldMatrix[i] = new byte[10];
        pushLine(i);
    }

    private void swapLines(int i, int j){
        byte[] temp;

        temp = fieldMatrix[i];
        fieldMatrix[i] = fieldMatrix[j];
        fieldMatrix[j] = temp;
    }

    private void pushLine(int i){
        for(int j = i; j > 0; j--){
            swapLines(j, j-1);
        }
    }

    public void addSquares(Tetromino t){
        for (int i = 0; i < t.shapeMatrix.length; i++){
            for (int j = 0; j < t.shapeMatrix[0].length; j++){
                fieldMatrix[t.position[0] +  i][t.position[1] + j] = t.shapeMatrix[i][j];
            }
        }
    }
}
