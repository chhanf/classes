package tetris;

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
        return checkCollision();
    }

    boolean checkDrop(){
        tetromino.drop();
        if(checkCollision()){
            tetromino.position[1] -= 1;
            return true;
        }
        tetromino.position[1] -= 1;
        return false;
    }

    boolean checkMoveLeft(){
        tetromino.moveLeft();
        if(checkCollision()){
            tetromino.moveRight();
            return true;
        }
        tetromino.moveRight();
        return false;
    }

    boolean checkMoveRight(){
        tetromino.moveRight();
        if(checkCollision()){
            tetromino.moveLeft();
            return true;
        }
        tetromino.moveLeft();
        return false;
    }

    boolean checkRotateLeft(){
        tetromino.rotateLeft();
        if(checkCollision()){
            tetromino.rotateRight();
            return true;
        }
        tetromino.rotateRight();
        return false;
    }

    boolean checkRotateRight(){
        tetromino.rotateRight();
        if(checkCollision()){
            tetromino.rotateLeft();
            return true;
        }
        tetromino.rotateLeft();
        return false;
    }

    void advanceDropCounter(){
        dropCounter += 1;
        if(dropCounter == dropSpeed){
            dropCounter = 0;
            if(checkDrop()){
                tetromino.drop();
            } else {
                playingField.addSquares(tetromino);
            }
        }
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

    private boolean checkCollision(){
        for(byte i = 0; i < tetromino.shapeMatrix.length; i++){
            for(byte j = 0; j < tetromino.shapeMatrix[0].length; j++){
                if(playingField.fieldMatrix[tetromino.position[0] + i][tetromino.position[1] + j] != 0
                        && tetromino.shapeMatrix[i][j] != 0){
                    return true;
                }
            }
        }
        return false;
    }
}
