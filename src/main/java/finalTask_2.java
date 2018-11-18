//import java.util.Arrays;
import java.util.Scanner;

public class finalTask_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте размер массива: ");
        int y = scanner.nextInt();
        int [] mas = new int[y];

        for (int n = 0; n < y; n++) {
            System.out.println("Введите значение mas[" + n + "]");
            mas[n] = scanner.nextInt();
        }

        for (int i = mas.length - 1; i>0; i--){
            for (int j=0; j<i; j++){
                if (mas[j] > mas[j+1]) {
                    int x = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = x;
                }
            }
        }
        //System.out.println(Arrays.toString(mas));

        scanner.close();
    }
}
