import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = in.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = in.nextLine();

        System.out.print("Введите количество очков здоровья: ");
        int hp= in.nextInt();

        Game game = new Game(new Player(name1,hp), new Player(name2,hp));
        game.start();

       /* while ((firstPlayer.getHp1() > 0) & (secondPlayer.getHp2() > 0)) {
            System.out.println("Введите силу удара от 1 до 9");
            System.out.println(secondPlayer.getHp2() + " " + firstPlayer.getHp1());
            if (k % 2 == 0) {
                System.out.println("Ход " + name1);
                int power = in.nextInt();
                firstPlayer.Play(power, k);
                System.out.println("У " + name2 + " осталось " + secondPlayer.getHp2());
                if (secondPlayer.getHp2() <= 0) {
                    System.out.println(name1 + " Выиграл");
                    break;
                }
            } else {
                System.out.println("Ход " + name2);
                int power = in.nextInt();
                secondPlayer.Play(power, k);
                System.out.println("У " + name1 + " осталось " + firstPlayer.getHp1());

                if (firstPlayer.getHp1() <= 0) {
                    System.out.println(name2 + " Выиграл");
                    break;
                }
            }
            k += 1;
        }*/
    }
}
