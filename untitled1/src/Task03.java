import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int digit = 0;
        int S=0;


        while (a != -3) {
            while (a > 0) {
                 digit = a%10;
                 S = S + digit;
                a = a/10;

                System.out.println(S);
            }

            a = scanner.nextInt();

        }


    }
}

