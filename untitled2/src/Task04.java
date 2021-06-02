import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int digit = 0;
        int S = 0;
        int C = 0;
        int R = 1;
        int k;



        while (a != -3) {

            C++;

            while (a > 0) {
                digit = a % 10;
                S = S + digit;
                a = a / 10;
      //               System.out.println(S);
            }
            if (S == 1) {
                R = R * C;
    //            System.out.println("Единица");
            }
            System.out.println(C);
            if (S == 2 || S == 3) {
                R = R * C;
    //            System.out.println("Два или три");
            }
            int d = 2;
            while (d < S) {
                if (S % d == 0) {
         //           System.out.println("Not Prime");
                    break;
                }
                d++;

            }
                k=1;
            if (k == 1) {R=R*C;
                k=k-1;
            System.out.println("dssdg");
            }
            k=k-1;


        //        System.out.println("Простое");

            k=0;
            S= 0;
            a = scanner.nextInt();
            System.out.println(R);
                }

            }

            }








        // R=1;
        //       System.out.println(C);






