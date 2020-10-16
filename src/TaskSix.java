public class TaskSix {
    public static void main(String[] args) {
        int[][] matrix2 = {
                {5, 7, 1},
                {0, 4, 7},
                {8, 6, 3},
                {2, 8, 1},
        };
        int[][] matrix = {
                {1, 5, 7},
                {5, 7, 2},
                {9, 0, 3},
                {4, 5, 8},
        };
        int[][] sumMatrix;

        sumMatrix = sum(matrix, matrix2);

        for (int r = 0; r < sumMatrix.length; r++) {
            for (int q = 0; q < sumMatrix[r].length; q++) {
                System.out.print(sumMatrix[r][q] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("");

    }


        public static int[][] sum ( int[][] m1, int[][] m2){
            int[][] matrix3 = new int[m1.length][m1[0].length];

            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    matrix3[i][j] = m1[i][j] + m2[i][j];
                }
            }

            return matrix3;
        }
}