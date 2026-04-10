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

        for(int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if(board[row][col] == '.') continue;
                    if(seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
