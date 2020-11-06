public class Task {
    public static void main(String[] args) {
        Vektor2D one = new Vektor2D(23.7,63.3);
        Vektor2D two = new Vektor2D(12.3, 54.7);
        double t = 10.0;
        one.add(two.x,two.y);
        System.out.println(one);

        one.sub(two.x, two.y);
        System.out.println(one);

        one.mult(t);
        System.out.println(one);
    }

}
