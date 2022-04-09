package com.company.Practise.loops;

public class Lessons2 {
    public static void main(String[] args) {
        int number = 345;
        int sum = 0;
        int copyOfNumber = number;

        if(copyOfNumber < 0){
            copyOfNumber = -number;
        }

        while(copyOfNumber > 0){
            sum += copyOfNumber % 10;
            copyOfNumber /= 10;
        }
        System.out.println(sum);
    }

}
