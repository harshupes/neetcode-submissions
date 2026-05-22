class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!isValid(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int row, int col, char[][] board) {

        if (board[row][col] == '.') return true;

        for (int i = 0; i < 9; i++) {

            // check row
            if (i != col && board[row][i] == board[row][col]) {
                return false;
            }

            // check column
            if (i != row && board[i][col] == board[row][col]) {
                return false;
            }

            // check 3×3 sub-grid
            int subRow = 3 * (row / 3) + i / 3;
            int subCol = 3 * (col / 3) + i % 3;

            if (subRow != row && subCol != col &&
                board[subRow][subCol] == board[row][col]) {
                return false;
            }
        }
        return true;
    }
}
