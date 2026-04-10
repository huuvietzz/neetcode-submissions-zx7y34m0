class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i = 0; i < 9; i++) {
            unordered_set<char> rowSet, colSet;
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if(rowSet.count(board[i][j])) return false;
                    rowSet.insert(board[i][j]);
                }
                if(board[j][i] != '.') {
                    if(colSet.count(board[j][i])) return false;
                    colSet.insert(board[j][i]);
                }
            }
        }

        for(int i = 0; i <= 6; i += 3) {
            for(int j = 0; j <= 6; j += 3) {
                unordered_set<char> boxSet;
                for(int k = i; k <= i + 2; k++) {
                    for(int l = j; l <= j + 2; l++) {
                        if(board[k][l] == '.') continue;
                        if(boxSet.count(board[k][l])) return false;
                        boxSet.insert(board[k][l]);
                    }
                }
            }
        }
        return true;
    }
};
