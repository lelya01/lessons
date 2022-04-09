package com.company.Massive;
//Вывести элементы массива в ряд
public class homeMassive1603 {
    public static void main(String[] args) {
        int []array = {4, 2, 6, 9, 12, 23, 4, 67, 8};
        printInLine(array);
    }

    static void printInLine(int []array) {
        for(int i = 0; i < array.length; i++ ){
            System.out.print(array[i] + " ");
        }
    }
}
