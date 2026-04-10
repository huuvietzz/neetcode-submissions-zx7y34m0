class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        int rows[9] = {0};
        int cols[9] = {0};
        int squares[9] = {0};

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                if(board[r][c] == '.') continue;
                
                int val = board[r][c] - '1';
                int k = (r / 3) * 3 + c / 3;
                int bit = 1 << val;

                if((rows[r] & bit) || (cols[c] & bit) || (squares[k] & bit)) {
                    return false;
                }

                rows[r] |= bit;
                cols[c] |= bit;
                squares[k] |= bit;
            }
        }
        return true;
    }
};
