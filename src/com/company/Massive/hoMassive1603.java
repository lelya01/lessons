package com.company.Massive;
//Вывести на экран только элементы стоящие на четных позициях
public class hoMassive1603 {
    public static void main(String[] args) {
        int []array = {4,3,5,7,1,45,32,45,41,34,3};

        for(int i = 2; i < array.length; i++){
            if(i % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
