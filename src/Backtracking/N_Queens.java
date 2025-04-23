package Backtracking;

public class N_Queens {
    public static boolean isSafe(char[][] board, int row, int col) {
        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal Left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal Right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char[][] board, int row) {
        // Base Case
        if (row == board.length) {
//            printBoard(board);
            count++;
            return true;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x';  // Backtracking
            }
        }
        return false;
    }
    public static void printBoard(char[][] board) {
        System.out.println("--------  chess board --------");
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }
    // The ways to solve n queens
    static int count = 0;
    public static void main(String[] args) {
        int n = 10;
        char[][] board = new char[n][n];
        // Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueens(board,0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solutions is not possible ");
        }
//        System.out.println("The ways to solve n queens = " + count);
    }
}
