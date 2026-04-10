class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        // Dùng mảng bool hoặc set để đánh dấu sự xuất hiện (1-9)
        bool row[9][9] = {false}, col[9][9] = {false}, box[9][9] = {false};
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                // if(board[i][j] != '.') {
                //     int num = board[i][j] - '1'; // Chuyển '1'-'9' thành 0-8
                //     int k = (i / 3) * 3 + j / 3; // Công thức xác định chỉ số khối 3x3
                    
                //     // Nếu số này đã xuất hiện trong hàng i, cột j hoặc khối k
                //     if(row[i][num] || col[j][num] || box[k][num]) {
                //         return false;
                //     }
                    
                //     // Đánh dấu đã xuất hiện
                //     row[i][num] = col[j][num] = box[k][num] = true;
                // }

                if(board[i][j] == '.') continue;
                int num = board[i][j] - '1';
                int k = (i / 3) * 3 + j / 3; 

                if(row[i][num] || col[j][num] || box[k][num]) {
                        return false;
                    }
                    
                    // Đánh dấu đã xuất hiện
                    row[i][num] = col[j][num] = box[k][num] = true;

            }
        }
        return true;
    }
};