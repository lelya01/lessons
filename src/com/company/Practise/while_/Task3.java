package com.company.Practise.while_;
//найти сумму четных чисел и их количество в диапазоне от 1 до 99
public class Task3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int count = 0;
        while (i <= 99) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
