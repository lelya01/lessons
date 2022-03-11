package com.company.Homework.task2;

import java.util.Scanner;

public class Task2For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        for(int number = -999; number < 2000; number += 55){
//            int num = scanner.nextInt();
//            System.out.println(number);
//        }
        int counter = 5;
        int start = -999;
        int n = start;
        for(int i = 0; i < counter ; i++){
            n += 55;
        }
        System.out.println(n);
    }
}
