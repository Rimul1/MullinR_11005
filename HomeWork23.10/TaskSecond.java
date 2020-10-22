import java.util.Scanner;

public class TaskSecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt() - 1;
        Otdo(A,B);
    }
    public static void Otdo(int A, int B){
        if(A == B){
            return;
        }
        Otdo(A ,B -1);
        System.out.print(B);

    }
}
