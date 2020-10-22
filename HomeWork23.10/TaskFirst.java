import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        System.out.print(proiz(N));
    }
    public static int proiz(int N) {
        int pro = 1;
        if (N < 1)
            return pro;
            return N * proiz(N - 1);
    }
}
