import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        while(a > 0) {
            System.out.print(a%10);
            a /= 10;
        }
        scanner.close();
    }
}
