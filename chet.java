import java.util.Scanner;

class Helloworld {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Input a number: ");
	int ch = in.nextInt();

if (ch % 2 == 0){
System.out.print(ch);
}
else System.out.print("число нечетное");
}

}