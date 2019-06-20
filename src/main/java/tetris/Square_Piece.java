package tetris;

public class Square_Piece extends Tetromino {

    public Square_Piece() {
        super();
        color = 0;
        shapeMatrix = new byte[4][4];
        position = new byte[2];
        position[0] = 3;
        position[1] = 6;
        name = "square_piece";

    }

    void updateShapeMatrix(){
        switch (shapeState){
            case Rotation_90:
            case Rotation_180:
            case Rotation_270:
            case Rotation_0:
                shapeMatrix[1][1] = 1;
                shapeMatrix[1][2] = 1;
                shapeMatrix[2][1] = 1;
                shapeMatrix[2][2] = 1;
        }
    }
}

