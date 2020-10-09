public class Second {
    public static void binar(int[] mas, int number, int l, int h) {

        int medium = l + ((h - l) / 2);

        if (mas[medium] == number) {
            System.out.println("Number is found! Position in array is: " + medium);
            return;
        }

        if (mas[medium] > number) {
            h = medium - 1;
            binar(mas, number, l, h);
        }

        if (mas[medium] < number) {
            l = medium + 1;
            binar(mas, number, l, h);
        }
    }

    public static void main(String[] args) {
        int x[] = {1, 4, 6, 7, 8, 9, 12, 15, 16, 19, 26, 31};
        int n = 31;
        binar(x, n, 0, x.length - 1);
    }
}
