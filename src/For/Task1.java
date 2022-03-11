package For;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 45;


        for (int attempt = 0; attempt < 3; attempt++) {
            int num = scanner.nextInt();
            if (num == number) {
                System.out.println("Поздравляю вы угадали");
                break;
            } else {
                System.out.println("Вы не угадали");
            }
        }
    }
}
