package com.company.Practise.while_;

import java.util.Scanner;

public class Lessons2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        for(int i = 0; i < 5; i++){
//            int a = scanner.nextInt();
//            System.out.println(a);
//        }
        int i = scanner.nextInt();
        while(i >= 0){
            System.out.println(i);
            i = scanner.nextInt();
        }
    }
}
