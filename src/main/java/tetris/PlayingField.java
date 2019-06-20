package tetris;

public class PlayingField {
    byte[][] fieldMatrix;

    public PlayingField(){
        fieldMatrix = new byte[24][13];
        for(int i = 0; i < fieldMatrix.length; i++){
            if(i == 23){for( int j = 0; j < fieldMatrix[0].length; j++){fieldMatrix[i][j] = 2;}}
            for (int j = 0; j < fieldMatrix[0].length; j++){
                if(j < 2 || j == 12) {fieldMatrix[i][j] = 2;}
            }
        }

    }

    public void clearLines(){
        for (byte i = 0; i < fieldMatrix.length - 1; i++){
            if(checkLine(i)){
                removeLine(i);
            }
        }
    }

    public void addSquares(Tetromino t){
        for (byte i = 0; i < t.shapeMatrix.length; i++){
            for (byte j = 0; j < t.shapeMatrix[0].length; j++){
                fieldMatrix[t.position[0] +  i][t.position[1] + j] = t.shapeMatrix[i][j];
            }
        }
    }

    private boolean checkLine(byte i){
        for (byte j = 2; j < 11; j++){
            if (fieldMatrix[i][j] == 0){
                return false;
            }
        }
        return true;
    }

    private void removeLine(byte i){
        byte[] a;
        a = new byte[] {2,2,0,0,0,0,0,0,0,0,0,0,2};
        fieldMatrix[i] = a;
        pushLine(i);
    }

    private void swapLines(byte i, byte j){
        byte[] temp;

        temp = fieldMatrix[i];
        fieldMatrix[i] = fieldMatrix[j];
        fieldMatrix[j] = temp;
    }

    private void pushLine(byte i){
        for(byte j = i; j > 0; j--){
            swapLines(j, (byte)(j-1));
        }
    }
}
