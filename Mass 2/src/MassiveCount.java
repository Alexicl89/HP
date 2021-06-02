import java.util.Scanner;

public class MassiveCount {
    public static void main(String[] args) {
        int n = 10;
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[n];
        int b;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            b = a[i];
            a[i] = a[n - i-1];
            a[n - i-1] = b;
        }

            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }

        }
        //  for (int i = 0; i < n/2; i++) {
        //     if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
        //       C = C + 1;
        //    }



        }








