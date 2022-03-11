package com.company.Practise.while_;
// Возвести n в степень k
public class Task5 {
    public static void main(String[] args) {
        final int num = 5;
        final int deg = 3;
        int result = num;

        int i = 0;
        while( i < deg - 1){
            result *= num;
            i++;
        }
        System.out.println(result);
    }
}
