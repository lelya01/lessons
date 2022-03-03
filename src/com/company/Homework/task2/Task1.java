package com.company.Homework.task2;

public class Task1 {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        int c = 9;
        int d = 2;
        int min = c;
//
//        if (a < b && a < c && a < d) {
//            System.out.println(a);
//        } else {
//            if (b < a && b < c && b < d) {
//                System.out.println(b);
//            }
//            if (c < a && c < b && c < d){
//                System.out.println(c);
//            }
//            else {
//                System.out.println(d);
//            }
//        }
        if(min > a ){
            min = a;
        }
        if(min > b){
            min = b;
        }
        if(min > d){
            min = d;
        }
        System.out.println(min);
    }
}





















