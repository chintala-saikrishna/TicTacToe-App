public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initializeBoard();   // UC1
        printBoard();        // UC1
    }

    // UC1: Initialize Board
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // UC1: Print Board
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}