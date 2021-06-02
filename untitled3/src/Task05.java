import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a[] = new int[10];
        int max, buff, buffmin, min, C;
                max = - 1000000000;
                min = 10000000;
        buff = 0;
        buffmin = 0;
        C=0;


        for (int i = 0; i < 10; i++) {

            a[i] = scanner.nextInt();

            if (a[i] >= max) {
                max = a[i];
                buff = i;
            }
            if (a[i] <= min) {
                min=a[i];
                buffmin = i;
                }
            }
        for (int i = 1; i < 9; i++) {
            if (a[i] > a [i-1] && a[i] > a [i+1]) {
                C = C + 1;
            }
            }


        System.out.println(max + " i = " + buff);

        System.out.println(min + " i = " + buffmin);
        System.out.println("C = " + C);
        }


    }



