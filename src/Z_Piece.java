public class Z_Piece extends Tetromino {

    public Z_Piece() {
        super();
        color = 2;
        shapeMatrix = new byte[3][3];
        position = new byte[2];
        position[0] = 4;
        position[1] = 1;
    }

    void updateShapeMatrix(){
        switch (shapeState){
            case Rotation_180:
            case Rotation_0:
                for(byte i = 0; i < 3; i++){
                    for(byte j = 0; j < 3; j++){
                        shapeMatrix[i][j] = 0;
                    }
                }
                shapeMatrix[1][0]=1;
                shapeMatrix[1][1]=1;
                shapeMatrix[2][1]=1;
                shapeMatrix[2][2]=1;
                break;
            case Rotation_270:
            case Rotation_90:
                for(byte i = 0; i < 3; i++){
                    for(byte j = 0; j < 3; j++){
                        shapeMatrix[i][j] = 0;
                    }
                }
                shapeMatrix[0][2]=1;
                shapeMatrix[1][1]=1;
                shapeMatrix[1][2]=1;
                shapeMatrix[2][1]=1;
                break;
        }
    }
}