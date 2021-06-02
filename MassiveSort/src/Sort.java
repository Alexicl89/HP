import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int n=10;
        int S = 0;
        int a[] = new int [100000];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 1200);
        }

        for (int i = 0; i < a.length; i++) {
            int c = i;
            int min = a[i];

            for (int j =i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    c = j;
                }
            }
            a[c] = a[i];
            a[i] = min;
        }
      //  for (int i = 0; i < a.length; i++) {
      //      System.out.println(a[i]);
      //  }
           // for (int i = 0; i < a.length; i++) {
        int l = 0;
        int r = a.length -1;
        int m = l + (r-l)/2;
        int c = 0;
        int F=0;


        while (F != 1 && c < a.length) {
        //    System.out.println("?");
                m = l + (r - l) / 2;
                c++;
           if (a[m] == 567) {
               F = 1;
               int k=m;
               System.out.println("Find" + " " + m);
               while (a[m] == a[m + 1]) {
                   m++;
                   System.out.println("Find" + " " + m);

           }
            while (a[k] == a[k-1]) {
                k--;
                System.out.println("Find" + " " + k);
            }
           }

            if (a[m] < 567) {
                l = m;
                m = l + (r - l) / 2;
                c++;
                            } else {
                r = m;
                m = r - (r - l) / 2;
                c++;
                           }

        }
        int cd = 1;
        for (int i = 0; i < a.length -1;  i++) {

            if (a[i] == a[i + 1]) {

                cd++;

            } else {
                System.out.println(a[i] + " " + cd);
                S=S+cd;
                cd = 1;
            }
                    }
        System.out.println(a[m] +" " + m + " " + c);
        System.out.println(S+1);
        System.out.println(a.length);

        }

    }









