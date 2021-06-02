import java.util.Scanner;

public class MassiveSortMax {
    public static void main(String[] args) {
        int n = 10;
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[n];
        int b;

      // int max = -100000000;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
                int c = i;
                int max = a[i];
            for (int j = i + 1; j< n ; j++) {
                if (a[j] > max) {
                    c = j;
                    max  = a[j];
                }

            }
            a[c] = a[i];
           a[i] = max;

         //  System.out.println("max = " + max);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}