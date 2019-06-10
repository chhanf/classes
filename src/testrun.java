public class testrun {
    public static void main(String[] args) {
/*        Tetromino tetromino = new Tetromino();

        System.out.println("Tetromino-attributes:");
        System.out.println("Color: " + tetromino.color);
        System.out.println("Position: (" + tetromino.position[0] + ", " + tetromino.position[1] + ")");

        tetromino.moveLeft();
        System.out.println("Position after moving left once: ("
                + tetromino.position[0] + ", " + tetromino.position[1] + ")");
        tetromino.moveRight();
        tetromino.moveRight();
        System.out.println("Position after moving right twice: ("
                + tetromino.position[0] + ", " + tetromino.position[1] + ")");
        tetromino.drop();
        System.out.println("Position after dropping once: ("
                + tetromino.position[0] + ", " + tetromino.position[1] + ")");*/

        Square_Piece squarePiece = new Square_Piece();
        squarePiece.updateShapeMatrix();

        System.out.println("Shapematrix-Square_Piece:");
        System.out.println("(" + squarePiece.shapeMatrix[0][0] + ", " + squarePiece.shapeMatrix[0][1] + ", "
                + squarePiece.shapeMatrix[0][2] + ", " + squarePiece.shapeMatrix[0][3] + ")");
        System.out.println("(" + squarePiece.shapeMatrix[1][0] + ", " + squarePiece.shapeMatrix[1][1] + ", "
                + squarePiece.shapeMatrix[1][2] + ", " + squarePiece.shapeMatrix[1][3] + ")");
        System.out.println("(" + squarePiece.shapeMatrix[2][0] + ", " + squarePiece.shapeMatrix[2][1] + ", "
                + squarePiece.shapeMatrix[2][2] + ", " + squarePiece.shapeMatrix[2][3] + ")");
        System.out.println("(" + squarePiece.shapeMatrix[3][0] + ", " + squarePiece.shapeMatrix[3][1] + ", "
                + squarePiece.shapeMatrix[3][2] + ", " + squarePiece.shapeMatrix[3][3] + ")");

        Line_Piece linePiece = new Line_Piece();
        linePiece.updateShapeMatrix();

        System.out.println("Shapematrix-Line_Piece:");
        System.out.println("(" + linePiece.shapeMatrix[0][0] + ", " + linePiece.shapeMatrix[0][1] + ", "
                + linePiece.shapeMatrix[0][2] + ", " + linePiece.shapeMatrix[0][3] + ")");
        System.out.println("(" + linePiece.shapeMatrix[1][0] + ", " + linePiece.shapeMatrix[1][1] + ", "
                + linePiece.shapeMatrix[1][2] + ", " + linePiece.shapeMatrix[1][3] + ")");
        System.out.println("(" + linePiece.shapeMatrix[2][0] + ", " + linePiece.shapeMatrix[2][1] + ", "
                + linePiece.shapeMatrix[2][2] + ", " + linePiece.shapeMatrix[2][3] + ")");
        System.out.println("(" + linePiece.shapeMatrix[3][0] + ", " + linePiece.shapeMatrix[3][1] + ", "
                + linePiece.shapeMatrix[3][2] + ", " + linePiece.shapeMatrix[3][3] + ")");

        linePiece.rotateRight();
        linePiece.updateShapeMatrix();

        System.out.println("rotated Shapematrix-Line_Piece:");
        System.out.println("(" + linePiece.shapeMatrix[0][0] + ", " + linePiece.shapeMatrix[0][1] + ", "
                + linePiece.shapeMatrix[0][2] + ", " + linePiece.shapeMatrix[0][3] + ")");
        System.out.println("(" + linePiece.shapeMatrix[1][0] + ", " + linePiece.shapeMatrix[1][1] + ", "
                + linePiece.shapeMatrix[1][2] + ", " + linePiece.shapeMatrix[1][3] + ")");
        System.out.println("(" + linePiece.shapeMatrix[2][0] + ", " + linePiece.shapeMatrix[2][1] + ", "
                + linePiece.shapeMatrix[2][2] + ", " + linePiece.shapeMatrix[2][3] + ")");
        System.out.println("(" + linePiece.shapeMatrix[3][0] + ", " + linePiece.shapeMatrix[3][1] + ", "
                + linePiece.shapeMatrix[3][2] + ", " + linePiece.shapeMatrix[3][3] + ")");
        
        J_Piece j_piece = new J_Piece();
        j_piece.updateShapeMatrix();

        System.out.println("Shapematrix-J_Piece Rotation_0:");
        System.out.println("(" + j_piece.shapeMatrix[0][0] + ", " + j_piece.shapeMatrix[0][1] + ", "
                + j_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + j_piece.shapeMatrix[1][0] + ", " + j_piece.shapeMatrix[1][1] + ", "
                + j_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + j_piece.shapeMatrix[2][0] + ", " + j_piece.shapeMatrix[2][1] + ", "
                + j_piece.shapeMatrix[2][2] + ")");

        j_piece.rotateRight();
        j_piece.updateShapeMatrix();

        System.out.println("Shapematrix-J_Piece Rotation_90:");
        System.out.println("(" + j_piece.shapeMatrix[0][0] + ", " + j_piece.shapeMatrix[0][1] + ", "
                + j_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + j_piece.shapeMatrix[1][0] + ", " + j_piece.shapeMatrix[1][1] + ", "
                + j_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + j_piece.shapeMatrix[2][0] + ", " + j_piece.shapeMatrix[2][1] + ", "
                + j_piece.shapeMatrix[2][2] + ")");

        j_piece.rotateRight();
        j_piece.updateShapeMatrix();

        System.out.println("Shapematrix-J_Piece Rotation_180:");
        System.out.println("(" + j_piece.shapeMatrix[0][0] + ", " + j_piece.shapeMatrix[0][1] + ", "
                + j_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + j_piece.shapeMatrix[1][0] + ", " + j_piece.shapeMatrix[1][1] + ", "
                + j_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + j_piece.shapeMatrix[2][0] + ", " + j_piece.shapeMatrix[2][1] + ", "
                + j_piece.shapeMatrix[2][2] + ")");

        j_piece.rotateRight();
        j_piece.updateShapeMatrix();

        System.out.println("Shapematrix-J_Piece Rotation_270:");
        System.out.println("(" + j_piece.shapeMatrix[0][0] + ", " + j_piece.shapeMatrix[0][1] + ", "
                + j_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + j_piece.shapeMatrix[1][0] + ", " + j_piece.shapeMatrix[1][1] + ", "
                + j_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + j_piece.shapeMatrix[2][0] + ", " + j_piece.shapeMatrix[2][1] + ", "
                + j_piece.shapeMatrix[2][2] + ")");

        L_Piece l_piece = new L_Piece();
        l_piece.updateShapeMatrix();

        System.out.println("Shapematrix-L_Piece Rotation_0:");
        System.out.println("(" + l_piece.shapeMatrix[0][0] + ", " + l_piece.shapeMatrix[0][1] + ", "
                + l_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + l_piece.shapeMatrix[1][0] + ", " + l_piece.shapeMatrix[1][1] + ", "
                + l_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + l_piece.shapeMatrix[2][0] + ", " + l_piece.shapeMatrix[2][1] + ", "
                + l_piece.shapeMatrix[2][2] + ")");

        l_piece.rotateRight();
        l_piece.updateShapeMatrix();

        System.out.println("Shapematrix-L_Piece Rotation_90:");
        System.out.println("(" + l_piece.shapeMatrix[0][0] + ", " + l_piece.shapeMatrix[0][1] + ", "
                + l_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + l_piece.shapeMatrix[1][0] + ", " + l_piece.shapeMatrix[1][1] + ", "
                + l_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + l_piece.shapeMatrix[2][0] + ", " + l_piece.shapeMatrix[2][1] + ", "
                + l_piece.shapeMatrix[2][2] + ")");

        l_piece.rotateRight();
        l_piece.updateShapeMatrix();

        System.out.println("Shapematrix-L_Piece Rotation_180:");
        System.out.println("(" + l_piece.shapeMatrix[0][0] + ", " + l_piece.shapeMatrix[0][1] + ", "
                + l_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + l_piece.shapeMatrix[1][0] + ", " + l_piece.shapeMatrix[1][1] + ", "
                + l_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + l_piece.shapeMatrix[2][0] + ", " + l_piece.shapeMatrix[2][1] + ", "
                + l_piece.shapeMatrix[2][2] + ")");

        l_piece.rotateRight();
        l_piece.updateShapeMatrix();

        System.out.println("Shapematrix-L_Piece Rotation_270:");
        System.out.println("(" + l_piece.shapeMatrix[0][0] + ", " + l_piece.shapeMatrix[0][1] + ", "
                + l_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + l_piece.shapeMatrix[1][0] + ", " + l_piece.shapeMatrix[1][1] + ", "
                + l_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + l_piece.shapeMatrix[2][0] + ", " + l_piece.shapeMatrix[2][1] + ", "
                + l_piece.shapeMatrix[2][2] + ")");

        S_Piece s_piece = new S_Piece();
        s_piece.updateShapeMatrix();

        System.out.println("Shapematrix-S_Piece Rotation_0:");
        System.out.println("(" + s_piece.shapeMatrix[0][0] + ", " + s_piece.shapeMatrix[0][1] + ", "
                + s_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + s_piece.shapeMatrix[1][0] + ", " + s_piece.shapeMatrix[1][1] + ", "
                + s_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + s_piece.shapeMatrix[2][0] + ", " + s_piece.shapeMatrix[2][1] + ", "
                + s_piece.shapeMatrix[2][2] + ")");

        s_piece.rotateRight();
        s_piece.updateShapeMatrix();

        System.out.println("Shapematrix-S_Piece Rotation_90:");
        System.out.println("(" + s_piece.shapeMatrix[0][0] + ", " + s_piece.shapeMatrix[0][1] + ", "
                + s_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + s_piece.shapeMatrix[1][0] + ", " + s_piece.shapeMatrix[1][1] + ", "
                + s_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + s_piece.shapeMatrix[2][0] + ", " + s_piece.shapeMatrix[2][1] + ", "
                + s_piece.shapeMatrix[2][2] + ")");

        s_piece.rotateRight();
        s_piece.updateShapeMatrix();

        System.out.println("Shapematrix-S_Piece Rotation_180:");
        System.out.println("(" + s_piece.shapeMatrix[0][0] + ", " + s_piece.shapeMatrix[0][1] + ", "
                + s_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + s_piece.shapeMatrix[1][0] + ", " + s_piece.shapeMatrix[1][1] + ", "
                + s_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + s_piece.shapeMatrix[2][0] + ", " + s_piece.shapeMatrix[2][1] + ", "
                + s_piece.shapeMatrix[2][2] + ")");

        s_piece.rotateRight();
        s_piece.updateShapeMatrix();

        System.out.println("Shapematrix-S_Piece Rotation_270:");
        System.out.println("(" + s_piece.shapeMatrix[0][0] + ", " + s_piece.shapeMatrix[0][1] + ", "
                + s_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + s_piece.shapeMatrix[1][0] + ", " + s_piece.shapeMatrix[1][1] + ", "
                + s_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + s_piece.shapeMatrix[2][0] + ", " + s_piece.shapeMatrix[2][1] + ", "
                + s_piece.shapeMatrix[2][2] + ")");

        Z_Piece z_piece = new Z_Piece();
        z_piece.updateShapeMatrix();

        System.out.println("Shapematrix-Z_Piece Rotation_0:");
        System.out.println("(" + z_piece.shapeMatrix[0][0] + ", " + z_piece.shapeMatrix[0][1] + ", "
                + z_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + z_piece.shapeMatrix[1][0] + ", " + z_piece.shapeMatrix[1][1] + ", "
                + z_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + z_piece.shapeMatrix[2][0] + ", " + z_piece.shapeMatrix[2][1] + ", "
                + z_piece.shapeMatrix[2][2] + ")");

        z_piece.rotateRight();
        z_piece.updateShapeMatrix();

        System.out.println("Shapematrix-Z_Piece Rotation_90:");
        System.out.println("(" + z_piece.shapeMatrix[0][0] + ", " + z_piece.shapeMatrix[0][1] + ", "
                + z_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + z_piece.shapeMatrix[1][0] + ", " + z_piece.shapeMatrix[1][1] + ", "
                + z_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + z_piece.shapeMatrix[2][0] + ", " + z_piece.shapeMatrix[2][1] + ", "
                + z_piece.shapeMatrix[2][2] + ")");

        z_piece.rotateRight();
        z_piece.updateShapeMatrix();

        System.out.println("Shapematrix-Z_Piece Rotation_180:");
        System.out.println("(" + z_piece.shapeMatrix[0][0] + ", " + z_piece.shapeMatrix[0][1] + ", "
                + z_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + z_piece.shapeMatrix[1][0] + ", " + z_piece.shapeMatrix[1][1] + ", "
                + z_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + z_piece.shapeMatrix[2][0] + ", " + z_piece.shapeMatrix[2][1] + ", "
                + z_piece.shapeMatrix[2][2] + ")");

        z_piece.rotateRight();
        z_piece.updateShapeMatrix();
        System.out.println("Shapematrix-Z_Piece Rotation_270:");
        System.out.println("(" + z_piece.shapeMatrix[0][0] + ", " + z_piece.shapeMatrix[0][1] + ", "
                + z_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + z_piece.shapeMatrix[1][0] + ", " + z_piece.shapeMatrix[1][1] + ", "
                + z_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + z_piece.shapeMatrix[2][0] + ", " + z_piece.shapeMatrix[2][1] + ", "
                + z_piece.shapeMatrix[2][2] + ")");

        T_Piece t_piece = new T_Piece();
        t_piece.updateShapeMatrix();

        System.out.println("Shapematrix-T_Piece Rotation_0:");
        System.out.println("(" + t_piece.shapeMatrix[0][0] + ", " + t_piece.shapeMatrix[0][1] + ", "
                + t_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + t_piece.shapeMatrix[1][0] + ", " + t_piece.shapeMatrix[1][1] + ", "
                + t_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + t_piece.shapeMatrix[2][0] + ", " + t_piece.shapeMatrix[2][1] + ", "
                + t_piece.shapeMatrix[2][2] + ")");

        t_piece.rotateRight();
        t_piece.updateShapeMatrix();

        System.out.println("Shapematrix-T_Piece Rotation_90:");
        System.out.println("(" + t_piece.shapeMatrix[0][0] + ", " + t_piece.shapeMatrix[0][1] + ", "
                + t_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + t_piece.shapeMatrix[1][0] + ", " + t_piece.shapeMatrix[1][1] + ", "
                + t_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + t_piece.shapeMatrix[2][0] + ", " + t_piece.shapeMatrix[2][1] + ", "
                + t_piece.shapeMatrix[2][2] + ")");

        t_piece.rotateRight();
        t_piece.updateShapeMatrix();

        System.out.println("Shapematrix-T_Piece Rotation_180:");
        System.out.println("(" + t_piece.shapeMatrix[0][0] + ", " + t_piece.shapeMatrix[0][1] + ", "
                + t_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + t_piece.shapeMatrix[1][0] + ", " + t_piece.shapeMatrix[1][1] + ", "
                + t_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + t_piece.shapeMatrix[2][0] + ", " + t_piece.shapeMatrix[2][1] + ", "
                + t_piece.shapeMatrix[2][2] + ")");

        t_piece.rotateRight();
        t_piece.updateShapeMatrix();

        System.out.println("Shapematrix-T_Piece Rotation_270:");
        System.out.println("(" + t_piece.shapeMatrix[0][0] + ", " + t_piece.shapeMatrix[0][1] + ", "
                + t_piece.shapeMatrix[0][2] + ")");
        System.out.println("(" + t_piece.shapeMatrix[1][0] + ", " + t_piece.shapeMatrix[1][1] + ", "
                + t_piece.shapeMatrix[1][2] + ")");
        System.out.println("(" + t_piece.shapeMatrix[2][0] + ", " + t_piece.shapeMatrix[2][1] + ", "
                + t_piece.shapeMatrix[2][2] + ")");

        t_piece.rotateRight();
        t_piece.updateShapeMatrix();

        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                arr[i][j] = i;
            }
        }
        arr[1] = new int[3];

        int[] temp = new int[3];

        temp = arr[2];
        arr[2] = arr[1];
        arr[1] = temp;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}

