import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while(true) {
            n = scanner.nextInt();
            if (n > 0)
                break;
            System.out.println("X");
        }

        int sum = 0;
        for (int i=1; i<=n; i++)
            sum += i;
        System.out.println(sum);

        scanner.close();
    }
}
