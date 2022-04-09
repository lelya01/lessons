package com.company.Homework.task2;

import java.util.Arrays;

public class Task0304 {

    public static void main(String[] args) {
        int []array = new int[5];
        fill(array, 3,4,6,8,2,0);
        System.out.println(Arrays.toString(array));
    }
    static void fill (int []array, int ...nums){
        for(int i = 0; i < array.length; i++){
            array[i] = nums[i % nums.length];
        }

    }
}
