import java.util.Scanner;
    public class MassiveSortMin {
        public static void main(String[] args) {
            int n=10;
            int a[] = new int [10];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }
             for (int i = 0; i < a.length; i++) {
                 int min = a[i];
               int c = i;
                 for (int j =i + 1; j < 10; j++) {
                     if (a[j] < min) {
                         min = a[j];
                          c = j;
                     }
                     a[c] = a[i];
                        a[i] = min;
                     }
                 }

                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }


            }



        }