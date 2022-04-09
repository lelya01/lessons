package com.company.Massive;
//Вывести элементы массива в обратном порядке
public class hMassive1603 {
    public static void main(String[] args) {
        int []array = {5, 4, 8, 3, 7, 0};
        printReverse(array);

    }

    static void printReverse(int []array){
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
