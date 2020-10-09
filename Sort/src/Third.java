import java.util.Arrays;

public class Third {
    public static void Sort(String[] mas, int minDlina) {
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i].charAt(0) > mas[j].charAt(0)) {
                    String k = mas[j];
                    mas[j] = mas[i];
                    mas[i] = k;
                    System.out.println("Fisrt - OK");
                }

                if (mas[i].charAt(0) == mas[j].charAt(0)) { //Проверка слов с одинаковой первой буквой
                    boolean t = true;
                    for (int h = 1; h < minDlina - 1; h++) {
                        if (mas[i].charAt(h) < mas[j].charAt(h)) {
                            System.out.println("Nothing changed");
                            break;
                        }

                        if (mas[i].charAt(h) > mas[j].charAt(h)) {
                            t = false;
                        }

                        if (t == false) {
                            String k = mas[j];
                            mas[j] = mas[i];
                            mas[i] = k;
                            System.out.println("Same words changed");
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String n = "bca cha cab acb";
        String[] wordsArray = n.split(" ");
        int minDlina = wordsArray[0].length();

        for (int j = 0; j < wordsArray.length; j++) {
            if (minDlina > wordsArray[j].length()) {
                minDlina = wordsArray[j].length();
            }
        }

       Sort(wordsArray, minDlina);

        for (int i = 0; i < wordsArray.length; i++) {
            System.out.println(wordsArray[i]);
        }

        //Arrays.sort(wordsArray);

    }
}