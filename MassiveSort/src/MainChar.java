import java.util.Scanner;
public class MainChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a  = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
     //   char c[] = scanner.nextLine().toCharArray();
        int anum = a - '0';
        int bnum  = b - '0';
        int R = anum + bnum;
        System.out.println(R);
    }
}
