import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String num = scanner.nextLine();
        String rev = " ";
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + num.charAt(i);
        }
        System.out.println("Reverse String is " + rev);

    }
}
