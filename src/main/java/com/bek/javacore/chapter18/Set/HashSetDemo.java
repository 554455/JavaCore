package com.bek.javacore.chapter18.Set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Гамма");
        hashSet.add("Эта");
        hashSet.add("Альфа");
        hashSet.add("Эпсилон");
        hashSet.add("Омега");
        hashSet.add("Бета");

        System.out.println(hashSet);
    }
}