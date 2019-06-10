import java.util.Random;

public class Game {
    PlayingField playingField;
    Tetromino tetromino;
    byte dropSpeed;
    byte dropCounter;

    public Game(){
        playingField = new PlayingField();
        tetromino = new Tetromino();
        dropSpeed = 60;
        dropCounter = 0;
    }

    boolean checkDead(){
        return false;
    }

    boolean checkDrop(){
        return false;
    }

    boolean checkMoveLeft(){
        return false;
    }

    boolean checkMoveRight(){
        return false;
    }

    boolean checkRotateLeft(){
        return false;
    }

    boolean checkRotateRight(){
        return false;
    }

    void advanceDropCounter(){

    }

    void spawnNextTetromino(){
        Random rand = new Random();
        int r = rand.nextInt(7);

        switch (r){
            case 0:
                tetromino = new T_Piece();
                break;
            case 1:
                tetromino = new Line_Piece();
                break;
            case 2:
                tetromino = new L_Piece();
                break;
            case 3:
                tetromino = new J_Piece();
                break;
            case 4:
                tetromino = new S_Piece();
                break;
            case 5:
                tetromino = new Z_Piece();
                break;
            case 6:
                tetromino = new Square_Piece();
                break;
            default:
                System.out.println("Should never happen");
                break;
        }
    }
}
