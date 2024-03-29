package tetris;

public class L_Piece extends Tetromino {

    public L_Piece() {
        super();
        color = 2;
        shapeMatrix = new byte[3][3];
        position = new byte[2];
        position[0] = 3;
        position[1] = 7;
        name = "l_piece";
    }

    void updateShapeMatrix(){
        switch (shapeState){
            case Rotation_0:
                for(byte i = 0; i < 3; i++){
                    for(byte j = 0; j < 3; j++){
                        shapeMatrix[i][j] = 0;
                    }
                }
                shapeMatrix[1][0]=1;
                shapeMatrix[1][1]=1;
                shapeMatrix[1][2]=1;
                shapeMatrix[2][0]=1;
                break;
            case Rotation_90:
                for(byte i = 0; i < 3; i++){
                    for(byte j = 0; j < 3; j++){
                        shapeMatrix[i][j] = 0;
                    }
                }
                shapeMatrix[0][0]=1;
                shapeMatrix[0][1]=1;
                shapeMatrix[1][1]=1;
                shapeMatrix[2][1]=1;
                break;
            case Rotation_180:
                for(byte i = 0; i < 3; i++){
                    for(byte j = 0; j < 3; j++){
                        shapeMatrix[i][j] = 0;
                    }
                }
                shapeMatrix[0][2]=1;
                shapeMatrix[1][0]=1;
                shapeMatrix[1][1]=1;
                shapeMatrix[1][2]=1;
                break;
            case Rotation_270:
                for(byte i = 0; i < 3; i++){
                    for(byte j = 0; j < 3; j++){
                        shapeMatrix[i][j] = 0;
                    }
                }
                shapeMatrix[0][1]=1;
                shapeMatrix[1][1]=1;
                shapeMatrix[2][1]=1;
                shapeMatrix[2][2]=1;
                break;
        }
    }
}
