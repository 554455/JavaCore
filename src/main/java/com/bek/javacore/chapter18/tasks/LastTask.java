package com.bek.javacore.chapter18.tasks;

public class LastTask {
    public static void main(String[] args) {
        int[] array = new int[] {4,5,6,6,8};
        System.out.println(isResult(array));
    }

    public static boolean isResult(int[] array){
        for (int i = 0; i < array.length; i++){

            if (array[i] == array[i + 1]){
                return true;
            }
        }
        return false;
    }
}
