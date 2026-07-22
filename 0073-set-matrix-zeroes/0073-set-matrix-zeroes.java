class Solution {
    public void setZeroes(int[][] matrix) {
     
    int m = matrix.length, n = matrix[0].length;
    boolean row0Zero = false, col0Zero = false;

    // Check if first row has any zero
    for (int j = 0; j < n; j++) {
        if (matrix[0][j] == 0) row0Zero = true;
    }

    // Check if first column has any zero
    for (int i = 0; i < m; i++) {
        if (matrix[i][0] == 0) col0Zero = true;
    }

    // Use first row/col as markers
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    // Apply markers to rest of matrix
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    // Handle first row and column at the end
    if (row0Zero) {
        for (int j = 0; j < n; j++) matrix[0][j] = 0;
    }
    if (col0Zero) {
        for (int i = 0; i < m; i++) matrix[i][0] = 0;
    }
}
}