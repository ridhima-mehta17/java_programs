import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        int search = scanner.nextInt();

        int l = 0, h = size - 1;
        boolean found = false;

        while (l <= h) {

            int m = (l + h) / 2;

            if (a[m] == search) {
                System.out.println("Element found");
                found = true;
                break;
            }
            else if (a[m] < search) {
                l = m + 1;
            }
            else {
                h = m - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
