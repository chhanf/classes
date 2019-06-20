package tetris;

public class testrun {
    public static void main(String[] args) {

        Game game = new Game();
        PlayingField playingField = new PlayingField();
/*
        System.out.println("original Playingfield:");

        for (byte i = 0; i < playingField.fieldMatrix.length; i++) {
            System.out.println(" ");
            for (byte j = 0; j < playingField.fieldMatrix[0].length; j++) {
                System.out.print(playingField.fieldMatrix[i][j]);
            }
        }

        for (byte i = 0; i < playingField.fieldMatrix.length - 1; i++) {
            if(i > 18){for(byte j = 2; j < playingField.fieldMatrix[0].length - 1; j++)
            {playingField.fieldMatrix[i][j] = 1;}}
        }

        System.out.println("\n \nPlayingfield before lineclear:");

        for (byte i = 0; i < playingField.fieldMatrix.length; i++) {
            System.out.println(" ");
            for (byte j = 0; j < playingField.fieldMatrix[0].length; j++) {
                System.out.print(playingField.fieldMatrix[i][j]);
            }
        }

        playingField.clearLines();
        System.out.println("\n \nPlayingfield after lineclear:");

        for (byte i = 0; i < playingField.fieldMatrix.length; i++) {
            System.out.println(" ");
            for (byte j = 0; j < playingField.fieldMatrix[0].length; j++) {
                System.out.print(playingField.fieldMatrix[i][j]);
            }
        }*/

        game.spawnNextTetromino();
        System.out.println(game.tetromino.name);
        for (byte i = 0; i < 8; i++){
            if(game.checkMoveLeft()){
                game.tetromino.moveLeft();
            }
        }
    }
}