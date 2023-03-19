package Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        /*
         * violating principles of
         * SOLID for a better understanding of subject
         */
        GetMultidimensionalArraysExemple();
        FixSetAndSameMultidimensionalArray();
        Output3x3Matrix();
    }

    private static void GetMultidimensionalArraysExemple() {
        int[][] sample = { { 1, 2, 3 }, { 4, 5, 6 } };
        /*
         * The array's two ([1][0]) indexes are called:
         * row index and column index.
         */
        int x = sample[1][0];
        System.out.println(x);
    }

    private static void FixSetAndSameMultidimensionalArray() {
        int[][] myArr = { { 1, 2, 3 }, { 4 }, { 5, 6, 7 } };
        myArr[0][2] = 42;
        int x = myArr[1][0];

        System.out.println("Normal get: " + x + ", Get what changed: " + myArr[0][2]);
    }

    private static void Output3x3Matrix() {
        int[][] matrix = {
                { 8, 1, 6 },
                { 3, 5, 7 },
                { 4, 9, 0 },
        };
        System.out.println("Start program output 3x3 matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
