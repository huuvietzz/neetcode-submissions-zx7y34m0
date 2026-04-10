class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Trong Java, khi khởi tạo mảng boolean, tất cả giá trị mặc định đã là false
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                int num = board[i][j] - '1';
                int k = (i / 3) * 3 + j / 3;
                if(rows[i][num] || cols[j][num] || boxes[k][num]) {
                    return false;
                }

                rows[i][num] = cols[j][num] = boxes[k][num] = true;
            }
        }

        return true;
    }
}
