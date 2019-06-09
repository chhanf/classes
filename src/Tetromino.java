public class Tetromino {
    byte[][] shapeMatrix;
    byte color;
    byte[] position;
    ShapeState shapeState;

    public Tetromino(){
        this.shapeState = ShapeState.Rotation_0;
    }

    enum ShapeState {
        Rotation_0,
        Rotation_90,
        Rotation_180,
        Rotation_270
    }


    void moveLeft(){
        position[0] = (byte) (position[0] - 1);
    }

    void moveRight(){
        position[0] = (byte) (position[0] + 1);
    }

    void drop(){
        position[1] = (byte) (position[1] + 1);
    }

    void rotateLeft() {
        switch (shapeState) {
            case Rotation_0:
                shapeState = ShapeState.Rotation_270;
                break;
            case Rotation_90:
                shapeState = ShapeState.Rotation_0;
                break;
            case Rotation_180:
                shapeState = ShapeState.Rotation_90;
                break;
            case Rotation_270:
                shapeState = ShapeState.Rotation_180;
                break;

        }
    }
    void rotateRight(){
        switch(shapeState){
            case Rotation_0:
                shapeState = ShapeState.Rotation_90;
                break;
            case Rotation_90:
                shapeState = ShapeState.Rotation_180;
                break;
            case Rotation_180:
                shapeState = ShapeState.Rotation_270;
                break;
            case Rotation_270:
                shapeState = ShapeState.Rotation_0;
                break;
        }
    }
}
