class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length - 1, col = matrix[0].length - 1;
        for (int i = row - 1; i >= 0; i--) {
            int num = matrix[i][0];
            for (int j = i + 1, colIndex = 1; j <= row && colIndex <= col; j++, colIndex++) {
                if (num != matrix[j][colIndex]) return false;
            }
        }
        for (int i = col - 1; i > 0; i--) {
            int num = matrix[0][i];
            for (int j = i + 1, rowIndex = 1; j <= col && rowIndex <= row; j++, rowIndex++) {
                if (num != matrix[rowIndex][j]) return false;
            }
        }
        return true;
    }
}