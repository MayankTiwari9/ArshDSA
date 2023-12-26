package Arrays.Easy;

public class SetMatrixZeros {
    public static void setZeros(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Efficient Solution :-
        int c0 = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;

                    if (j == 0)
                        c0 = 0;
                    else
                        matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] != 0) {

                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        if (c0 == 0) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

        // Better Solution :-

        // int row[] = new int[rows];
        // int col[] = new int[cols];

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // if(matrix[i][j] == 0){
        // row[i] = 1;
        // col[j] = 1;
        // }
        // }
        // }

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // if(row[i] == 1 || col[j] == 1){
        // matrix[i][j] = 0;
        // }
        // }
        // }

        // Naive Solution :- TC O((n*m)*(n+m)) + O(n*m)
        // boolean[] zeroRows = new boolean[rows];
        // boolean[] zeroCols = new boolean[cols];

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // if (matrix[i][j] == 0) {
        // zeroRows[i] = true;
        // zeroCols[j] = true;
        // }
        // }
        // }

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // if (zeroRows[i] || zeroCols[j]) {
        // matrix[i][j] = 0;
        // }
        // }
        // }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 } };

        setZeros(matrix);
    }
}
