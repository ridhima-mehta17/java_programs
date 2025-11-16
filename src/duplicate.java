import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] a = new String[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLine();
        }

        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].equals(a[j])) {
                    System.out.println("Duplicate element: " + a[i]);
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.println("No Duplicate element");
        }
    }
}
