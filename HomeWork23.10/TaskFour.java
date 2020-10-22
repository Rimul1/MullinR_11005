public class TaskFour {
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(akkerman(m, n));
    }

    public static int akkerman(int M, int N) {

        if (M == 0) {
            return N + 1;
        }

        if (M > 0 && N == 0) {
            M--;
            return akkerman(M, 1);
        }

        if (M > 0 && N > 0) {
            int tempM = M;
            M--;
            N--;
            return akkerman(M, akkerman(tempM, N));
        }
        return 0;
    }


}
