import java.util.Arrays;
public class TaskFour {
    public static void main(String[] args) {
        int[] mass1 = {1, 3, 5};
        int[] mass2 = {2, 4, 6};
        System.out.print("Массив полученный после склеивания: ");
        System.out.println(kley(mass1,mass2));
    }
    public static String kley(int []c, int[]a) {
        int[] newArray;
        newArray = new int[c.length + a.length];

        for (int i = 0; i < newArray.length; i++) {

            if (i < c.length) {
                newArray[i] = c[i];
            }

            if (c.length <= i) {
                newArray[i] = a[i - c.length] ;
            }
        }
        return Arrays.toString(newArray);
    }
}
