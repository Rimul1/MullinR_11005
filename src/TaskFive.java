import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        System.out.println("Vvedite razmer massiva");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[][] mass = new int[k][k];
        array(mass,k);
        System.out.println("_________");
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass.length; j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] array(int[][] massArray, int k) {
        for (int i = 0; i < massArray.length; i++) {
            for (int j = 0; j < massArray.length; j++) {
                massArray[i][j] = (int) (Math.random() * 100);
            }
        }
        int[][] copymass = new int[k][k];
        for (int i = 0; i < massArray.length; i++) {
            for (int j = 0; j < massArray.length; j++) {
           copymass[i][j] = massArray[i][j];
            }
        }
        for (int i = 0; i < copymass.length; i++) {
            for (int j = 0; j < copymass.length; j++) {
                System.out.print(copymass[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("_________");
        for (int i = 0; i < copymass.length; i++) {
            for (int j = i; j < copymass.length; j++) {
                int p = copymass[i][j];
                copymass[i][j] = copymass[j][i];
                copymass[j][i] = p;
            }
        }

        for (int i = 0; i < copymass.length; i++) {
            for (int j = 0; j < copymass.length; j++) {
                System.out.print(copymass[i][j] + " ");
            }
            System.out.println("");
        }
        return copymass;
    }
}
