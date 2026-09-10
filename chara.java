import java.util.Scanner;

class chara{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Number of characters = " + str.length());

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse = " + reverse);

        if (str.equals(reverse)) {
            System.out.println("Palindrome = Yes");
        } else {
            System.out.println("Palindrome = No");
        }
    }
}