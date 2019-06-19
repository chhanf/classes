package tetris;

public class Line_Piece extends Tetromino {

    public Line_Piece() {
        super();
        color = 0;
        shapeMatrix = new byte[4][4];
        position = new byte[2];
        position[0] = 3;
        position[1] = 0;

    }

    void updateShapeMatrix(){
        switch (shapeState){
            case Rotation_180:
            case Rotation_0:
                for(byte i = 0; i < 4; i++){
                    for(byte j = 0; j < 4; j++){
                        shapeMatrix[i][j] = 0;
                    }
                }
                shapeMatrix[2][0]=1;
                shapeMatrix[2][1]=1;
                shapeMatrix[2][2]=1;
                shapeMatrix[2][3]=1;
                break;
            case Rotation_270:
            case Rotation_90:
                for(byte i = 0; i < 4; i++){
                    for(byte j = 0; j < 4; j++){
                        shapeMatrix[i][j] = 0;
                    }
                }
                shapeMatrix[0][2]=1;
                shapeMatrix[1][2]=1;
                shapeMatrix[2][2]=1;
                shapeMatrix[3][2]=1;
        }
    }
}
