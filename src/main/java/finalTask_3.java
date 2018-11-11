import java.util.Scanner;

public class finalTask_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите курс валют: ");
        double course = scanner.nextFloat();

        System.out.print("Введите сумму в рублях: ");
        int sum = scanner.nextInt();

        System.out.printf((sum + " RUB = ") +"%.2f", sum / course);
        System.out.println(" USD");

        scanner.close();
    }
}
