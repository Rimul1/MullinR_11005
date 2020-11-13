public class Player {
    private String name;
    private int hp;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name + "(" + hp + ")";
    }
}
