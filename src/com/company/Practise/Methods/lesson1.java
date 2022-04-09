package com.company.Practise.Methods;

public class lesson1 {
    public static void main(String[] args) {
        System.out.println(doPayment(560, 43));
    }
    static long doPayment(long balance, int price){
        return balance - price;

    }
    static double doPayment(int balance, int price){
        return balance - price / 140.0;
    }
}
