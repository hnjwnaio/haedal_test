import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = 0;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            day = 30;
        else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                day = 29;
            else
                day = 28;
        }
        else
            day = 31;

        System.out.println(day);

        scanner.close();
    }
}
