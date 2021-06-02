public class CharToInt {
    public static void main(String[] args) {
        char a[] = {'6', '9', '7', '1', '8'};
        //  int b[] = new int [5];
        for (int i = 0; i < a.length / 2; i++) {
            char temp = a[i];
            a[i] = a[4 - i];
            a[4 - i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


        int R = 0;
        int d = 1;
        for (int i = 0; i < 5; i++) {
            int trans = a[i] - '0';
            trans = trans * d;
            d = d * 10;
            R = R + trans;
        }
        System.out.println(R);
        int Res2 = R + 10;
        System.out.println(Res2);


    }
}
