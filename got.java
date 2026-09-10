import java.util.Scanner;

class GreaterOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int greater = a;

        if (b > greater) {
            greater = b;
        }

        if (c > greater) {
            greater = c;
        }

        System.out.println("Greater number = " + greater);
    }
}