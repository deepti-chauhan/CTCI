public class ZeroMatrix {
    static void setZero(int[][] matrix) {

        boolean[] row = new boolean[matrix.length]; // initialize array for row.
        boolean[] col = new boolean[matrix[0].length]; // initialize array for column.

        for (int i = 0; i < matrix.length; i++) // traverse through matrix to set row & col = true for
        { // any occurence of 0 in the matrix.
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        /*---------set row and col zero----------*/
        for (int i = 0; i < matrix.length; i++) {
            if (row[i] == true) {
                setRowZero(matrix, i);
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if (col[j] == true) {
                setColZero(matrix, j);
            }
        }
    }

    /*-----setRowZero and setColZero-----*/
    static void setRowZero(int[][] mat, int r) {
        for (int j = 0; j < matrix[0].length; j++) {
            mat[r][j] = 0;
        }
    }

    static void setColZero(int[][] mat, int c) {
        for (int i = 0; i < matrix.length; i++) {
            mat[i][c] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZero(matrix);

        for (int row = 0; matrix.length; row++) {
            for (int col = 0; matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
