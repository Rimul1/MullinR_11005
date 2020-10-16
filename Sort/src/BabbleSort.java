public class BabbleSort {
    public static void main(String[] args) {
        int[] mas = new int[]{6, 5, 3, 1, 8, 7, 2, 4};

        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas.length - 1 - j; i++) {
                if (mas[i] > mas[i + 1]) {

                    int peremen = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = peremen;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");

        }
    }
}
