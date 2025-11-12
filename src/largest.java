import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int large=c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(large);
    }
}
