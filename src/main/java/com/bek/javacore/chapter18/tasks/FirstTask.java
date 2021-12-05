package com.bek.javacore.chapter18.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstTask {

    public static void main(String[] args) {
        int[] array = new int[] { 3, 8, 15, 17};
        int target = 23;

        System.out.println(Arrays.toString(twoSum(array, target)));
    }

    public static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++){
            map.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++){
            int numbers = target - array[i];

            if (map.containsKey(numbers) && map.get(numbers) != i){
                return new int[] {i, map.get(numbers)};
            }
        }

        throw new IllegalArgumentException("no match found");
    }

}
