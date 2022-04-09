package com.company.Practise.For;
//Уравнение с одним неизветсным. Напр. int y = 50 * x.
//Найти значение х , при котором уравнение будет верным при заданном у
public class Task04032022 {
    public static void main(String[] args) {
        int y = -200;
        int delta = 50;


        if(y < 0){
            delta = -50;
        }

        int result = 0;


        int x = 0;

        if(y > 0) {
            while (result < y) {
                result += delta;
                x++;
            }
        }
        else {
            while (result > y) {
                result += delta;
                x--;
            }
        }
        if (result == y) {
            System.out.println("Уравнение имеет решение");
            System.out.println(x);
        }





    }
}
