package com.bek.javacore.chapter18.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");

        System.out.println(treeSet);
    }
}
