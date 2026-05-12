class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char current = board[row][col];

                if (current == '.') {
                    continue;
                }

                if (!seen.add(current + " in row " + row)) {
                    return false;
                }

                if (!seen.add(current + " in col " + col)) {
                    return false;
                }

                int boxRow = row / 3;
                int boxCol = col / 3;

                if (!seen.add(current + " in box " + boxRow + "," + boxCol)) {
                    return false;
                }
            }
        }

        return true;
    }
}
