class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i = 0; i < 9; i++) {
            unordered_set<char> rowSet, colSet;
            for(int j = 0; j < 9; j++) {
               // Kiểm tra hàng i
                if(board[i][j] != '.') {
                    if(rowSet.count(board[i][j])) return false;
                    rowSet.insert(board[i][j]);
                }
                // Kiểm tra cột i
                if(board[j][i] != '.') {
                    if(colSet.count(board[j][i])) return false;
                    colSet.insert(board[j][i]);
                }
            }
        }
        
        for(int i = 0; i <= 6; i += 3) {
            for(int j = 0; j <= 6; j += 3) {
                unordered_set<char> se;        
                for(int k = i; k <= i + 2; k++) {
                    for(int l = j; l <= j + 2; l++) {
                        if(board[l][k] != '.') {
                            if(se.count(board[l][k])) return false;
                            se.insert(board[l][k]);
                        }
                    }
                }
            }
        }
        return true;
    }
};
