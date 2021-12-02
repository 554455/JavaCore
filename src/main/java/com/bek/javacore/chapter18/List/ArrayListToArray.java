package com.bek.javacore.chapter18.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("Coдepжимoe списочного массива arrayList: " + arrayList);

        Integer array[] = new Integer[arrayList.size()];

        array = arrayList.toArray(array);

        int sum  = 0;

        for (int i : array) sum += i;

        System.out.println("Сумма " + sum);

    }
}
