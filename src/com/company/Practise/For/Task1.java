package com.company.Practise.For;
//Программа загадывает число (вручную).Пользователь вводит с клавиатуры число.
//Если человек угадал, то необходимо поздравить его с победой, но если за три попытки число не оказалось верным, то вывести верное число
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 45;
        boolean isRight = false;

        for (int attempt = 0; attempt < 3; attempt++) {
            int num = scanner.nextInt();
            if (num == number) {
                System.out.println("Поздравляю, вы угадали");
                isRight = true;
                break;
            }
            else {
                System.out.println("Вы не угадали");
            }
        }
        if(!isRight){
            System.out.println(number);
        }
    }
}
