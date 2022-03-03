package com.company.Practise.while_;
//Вычислить сумму цифр числа
public class Task6 {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
       while(num > 0){
           sum += num;
           System.out.println(sum);
       }
    }
}
