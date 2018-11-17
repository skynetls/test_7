import java.util.Scanner;

public class finalTask_1 {
    public static void main(String[] args) {
        int [] multiplier1 = {1,2,3,4,5,6,7,8,9};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Вывести таблицу умножения на ");
        int multiplier2 = scanner.nextInt();

        for (int i = 0; i < multiplier1.length; i++){
            System.out.println(multiplier1[i] + "*" + multiplier2 + "=" + multiplier1[i]*multiplier2);
        }

    }
}
