import java.util.Scanner;

public class Four {
    public static int mas(int[][] m, int s, int i, int j) {
        int k = 0;
        boolean t = true;
        while (i < s && j < s) {
            if (m[i][j] % 2 != 0) {
                t = false;
                break;
            }
            i++;
            j++;
            k++;
        }

        if (t == true) {
            return k;
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину матрицы: ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ((int) (Math.random() * 10));
            }
        }

        for (int h = 0; h < matrix.length; h++) {
            for (int r = 0; r < matrix[0].length; r++) {
                System.out.format("%6d ", matrix[h][r]);
            }
            System.out.println("");
        }

        int i = 1, j = 1;
        int p = 0;

        while (j <= n - 2) {
            p += mas(matrix, n,0,j);
            j++;
        }

        while (i <= n - 2) {
            p += mas(matrix, n, i,0);
            i++;
        }

        p += mas(matrix, n,0,0);

        if ((n * n)/2 <= p) {
            System.out.println("Четных чисел достаточно!");
        }
        System.out.println(p);

    }
}
