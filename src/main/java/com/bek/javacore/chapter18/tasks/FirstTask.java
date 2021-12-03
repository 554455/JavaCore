package com.bek.javacore.chapter18.tasks;

import java.util.Arrays;

public class FirstTask {

    public static void main(String[] args) {
        int[] array = new int[] { 3, 8, 15, 17};
        int target = 23;

        System.out.println(Arrays.toString(twoSum(array, target)));
    }

    public static int[] twoSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[j]  == target - array[i]){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }

}
