import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int digit = 0;
        int S=0;
        int C=0;
        int R=1;


        while (a != -3) {
            C++;
            while (a > 0) {
                digit = a%10;
                S = S + digit;
                a = a/10;
                System.out.println(S);
            }
            if (S==1) {
                return;
            }


            a = scanner.nextInt();

        }


    }
}

