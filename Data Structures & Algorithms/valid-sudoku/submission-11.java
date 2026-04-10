class Solution {
    public boolean isValidSudoku(char[][] board) {
    int[] rows = new int[9];
    int[] cols = new int[9];
    int[] boxes = new int[9];

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (board[i][j] == '.') continue;
            
            int num = board[i][j] - '1';
            int k = (i / 3) * 3 + (j / 3);
            int bit = 1 << num; // Tạo mặt nạ bit tại vị trí của số đó

            if ((rows[i] & bit) != 0 || (cols[j] & bit) != 0 || (boxes[k] & bit) != 0) {
                return false;
            }

            rows[i] |= bit;
            cols[j] |= bit;
            boxes[k] |= bit;
        }
    }
     return true;
   }
}
