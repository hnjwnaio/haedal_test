import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.next();
        if(ch.equals("a") || ch.equals("e") || ch.equals("i")
        || ch.equals("o") || ch.equals("u"))
            System.out.println("O");
        else
            System.out.println("X");

        scanner.close();
    }
}
