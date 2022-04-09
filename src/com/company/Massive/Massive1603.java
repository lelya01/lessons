package com.company.Massive;
//Определить есть ли в массиве заданное число
public class Massive1603 {
    public static void main(String[] args) {
        int []array = {22, 93, 2, 6, 75, 13};
        System.out.println(contains(array, 75));
    }

    static boolean contains(int []array, int value){
        for(int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return true;
            }
        }
        return false;
    }
}
