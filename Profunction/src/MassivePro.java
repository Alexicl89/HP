import java.util.Scanner;
public class MassivePro {

    public static int NumbersSum(int number) {
        int S = 0;
        while (number != 0) {
            S = S + number % 10;
            number = number / 10;
        }
        return S;
    }

    public static void Reverse(int Ar[]) {
        for (int i = 0; i < Ar.length/2; i++) {
            int temp = Ar[i];
            Ar[i] = Ar[Ar.length - i - 1];
            Ar[Ar.length - i - 1] = temp;
        }
    }

    public static void Print(int Ar[]) {
        for (int i = 0; i < Ar.length; i++) {
            System.out.println(Ar[i]);
        }
    }
    public static void SortMassive(int Ar[]) {
        for(int i = 0; i < Ar.length; i++) {
            int index = i;
            int min = Ar[i];

                for(int j = i + 1; j < Ar.length; j++) {
                    if (Ar[j] < min) {
                        min = Ar[j];
                        index = j;
                    }
            }
                Ar [index] = Ar[i];
                Ar [i] = min;

        }
     //   for (int i=0; i<Ar.length; i++) {
     //       System.out.println(Ar[i]);
        }




        public static void main (String[]args){
            //   Scanner scanner = new Scanner(System.in);
            //  int a = scanner.nextInt();
            int Ar[] = {1, 7, 6, 3, 8, -9, 56, -78, 4, 97};
            SortMassive(Ar);
            Print(Ar);
            //int Result = NumbersSum(a);
            //    System.out.println(Ar);
        }


}
