class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        int index = 0;

        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if (board[i][j] == word.charAt(index)) {
                    if(searchNext(board, word,index, i, j, m, n)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean searchNext(char[][] board, String word, int index, int row, int col, int m, int n) {
        if (index == word.length()) {
            return true;
        }

        if (row<0 || col<0 || row == m || col == n || board[row][col]!=word.charAt(index) || board[row][col]=='!') {
            return false;
        }

        char c = board[row][col];
        board[row][col] = '!';

        boolean top = searchNext(board, word, index+1, row-1, col, m, n);

        boolean left = searchNext(board, word, index+1, row, col+1, m, n);

        boolean right = searchNext(board, word, index+1, row, col-1, m, n);

        boolean bottom = searchNext(board, word, index+1, row+1, col, m, n);

        board[row][col] = c;

        return top || left || right || bottom;
    }
}