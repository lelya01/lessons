package com.company.Practise.while_;
//Проверить простое ли число?
//сколько раз выполняется тело while и ускорить выполнение кода, уменьшить выполнение цикла while
public class Task4 {
    public static void main(String[] args) {
        int num = 8;
        int i = 2;
        boolean isSimple = true;
        while(i < num){
            if(num % i ==0){
                isSimple = false;
            }
            i++;
        }
        if (isSimple){
            System.out.println("простое число");
        }
        else{
            System.out.println("непростое число");
        }
        System.out.println(i);
    }
}

