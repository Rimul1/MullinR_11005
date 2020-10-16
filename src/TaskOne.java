import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int chisloos = in.nextInt();
        int kolos = example(chisloos);
        System.out.println(kolos);
    }
    public static int example(int chislo){
        int k = 0;
            for (int i = 0; i < chislo;){
                k++;
                chislo = chislo/10;
            }
        return k;

    }
}
