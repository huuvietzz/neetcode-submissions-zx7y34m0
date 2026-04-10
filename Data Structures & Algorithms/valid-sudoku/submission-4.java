class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if(rowSet.contains(board[i][j])) return false;
                    rowSet.add(board[i][j]);
                }
                
                if(board[j][i] != '.') {
                    if(colSet.contains(board[j][i])) return false;
                    colSet.add(board[j][i]);
                }
            }
        }

        for(int i = 0; i <= 6; i += 3) {
            for(int j = 0; j <= 6; j+= 3) {
                Set<Character> boxSet = new HashSet<>();
                for(int k = i; k <= i + 2; k++) {
                    for(int l = j; l <= j + 2; l++) {
                        if(board[l][k] != '.') {
                            if(boxSet.contains(board[l][k])) return false;
                            boxSet.add(board[l][k]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
