public class VstavkaSort {
    public static void main(String[] args) {
        int[] mas = new int[]{6, 5, 3, 1, 8, 7, 2, 4};

        for (int i = 1; i < mas.length; i++) {
            int j = i;
           while (j > 0 && mas[j] < mas[j - 1]){
               int peremen = mas[j];
               mas[j] = mas[j - 1];
               mas[j - 1] = peremen;
               j--;
           }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
/* //for (int j = i; j > 0; j--) {

                    if (mas[j] < mas[j - 1]) {
                        int peremen = mas[j];
                        mas[j] = mas[j - 1];
                        mas[j - 1] = peremen;
                    }

            }*/