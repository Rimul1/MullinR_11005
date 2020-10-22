import java.util.Scanner;

public class TaskThird {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() ;
        int first = 0, second = 1, fibo = 0;

        System.out.print("Число Фибоначчи, с номером "+ n + " = "+Fibonach(n, first, second, fibo));
    }

    public static int Fibonach(int n, int first, int second, int begin) {
        if (n < 1) {
            return second;
        }
        begin = second;
        second = second + first;
        first = begin;

        return Fibonach(n - 1, first, second, begin);
    }
}
