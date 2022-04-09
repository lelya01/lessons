package com.company.Massive;
//Найти кол-во четных элементов
public class homMassive1603 {
    public static void main(String[] args) {
        int []array = {22, 93, 2, 6, 75, 13};

        System.out.println(getCountOfEven(array));
    }

    static int getCountOfEven(int []array){
        int counter = 0;

        for(int i = 0; i < array.length; i++){

            if(isEven(array[i])){
                counter++;
            }
        }
        return counter;
    }

    static boolean isEven(int num){
        if(num % 2 == 0){

        }
        return num % 2 ==0;
    }
}
