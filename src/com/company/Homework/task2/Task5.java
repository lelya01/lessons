package com.company.Homework.task2;

public class Task5 {
    public static void main(String[] args) {
        int num = 789657;
        int num0 = 7;
        int num1 = 8;
        int num2 = 9;
        int num3 = 6;
        int num4 = 5;
        int num5 = 7;

        int firstSum = num0 + num1 + num2;
        int lastSum = num3 + num4 + num5;

        if (firstSum == lastSum) {
            System.out.println("Счастливый билет");
        }
        else {
            System.out.println("Несчастливый билет");
        }
    }
}
