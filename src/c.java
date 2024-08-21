import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int height = scanner.nextInt();

        if (age >= 14 || height >= 160)
            System.out.println("X");
        else
            System.out.println("O");

        scanner.close();
    }
}
