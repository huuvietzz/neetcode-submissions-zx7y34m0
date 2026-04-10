class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i = 0; i < 9; i++) {
            unordered_set<char> se1, se2;
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if(se1.find(board[i][j]) == se1.end()) {
                        se1.insert(board[i][j]);
                    }
                    else {
                        return false;
                    }
                }

                if(board[j][i] != '.') {
                    if(se2.find(board[j][i]) == se2.end()) {
                        se2.insert(board[j][i]);
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        
        for(int i = 0; i <= 6; i += 3) {
            for(int j = 0; j <= 6; j += 3) {
                unordered_set<char> se;        
                for(int k = i; k <= i + 2; k++) {
                    for(int l = j; l <= j + 2; l++) {
                        if(board[l][k] != '.') {
                            if(se.find(board[l][k]) == se.end()) {
                                 se.insert(board[l][k]);
                            }
                            else {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
};
