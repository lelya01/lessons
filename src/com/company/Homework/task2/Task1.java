package com.company.Homework.task2;

public class Task1 {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        int c = 9;
        int d = 2;

        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else {
            if (b < a && b < c && b < d) {
                System.out.println(b);
            }
            if (c < a && c < b && c < d){
                System.out.println(c);
            }
            else {
                System.out.println(d);
            }

        }
    }
}





















