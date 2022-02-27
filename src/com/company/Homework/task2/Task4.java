package com.company.Homework.task2;

public class Task4 {
    public static void main(String[] args) {
        int a = -7;
        int b = 9;
        int c = 10;
        int d = b * b - 4 * a * c;

        if(d < 0){
            System.out.println("Корней нет");
        }

        else{
            double sqrtOfD = Math.sqrt(d);
            double x1 = -(b - sqrtOfD) / (2 * a);
            double x2 = -(b + sqrtOfD) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}


