import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        String org = str;
        String rev = "";

        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (org.equals(rev))
            System.out.println(org + " is a Palindrome");
        else
            System.out.println(org + " is not a Palindrome");

        scanner.close();
    }
}
