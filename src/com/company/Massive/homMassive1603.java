package com.company.Massive;
//Найти кол-во четных элементов
public class homMassive1603 {
    public static void main(String[] args) {
        long []array = {22,93,2,6,75,13};

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
