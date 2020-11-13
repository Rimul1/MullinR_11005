import java.util.Scanner;

public class Game {
    private Scanner in;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        in = new Scanner(System.in);
        while ((player1.getHp() > 0) && (player2.getHp() > 0)) {
            System.out.println("Ход " + player1);
            attack(getPower(), player2);
            if (player2.getHp() <= 0) {
                System.out.println(player1.getName() + " выиграл");
                return;
            }
            System.out.println("Ход " + player2);
            attack(getPower(), player1);
            if (player1.getHp() <= 0) {
                System.out.println(player2.getName() + " выиграл");
                return;
            }
        }
    }

    private void attack(int power, Player enemy) {
        int percent = power * 10;
        int random = (int) (Math.random() * 100);

        if (percent < random) {
            enemy.setHp(enemy.getHp() - power);
        } else {
            System.out.println("Промах");
        }
    }

    private int getPower() {
        System.out.println("Введите силу удара от 1 до 9");
        return in.nextInt();
    }



}
