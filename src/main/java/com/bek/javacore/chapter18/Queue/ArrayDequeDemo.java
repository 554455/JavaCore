package com.bek.javacore.chapter18.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.push("F");
        arrayDeque.push("E");
        arrayDeque.push("D");
        arrayDeque.push("B");
        arrayDeque.push("A");

        System.out.print("Извлeчeниe из стека : ");

        while (arrayDeque.peek() != null)
            System.out.print(arrayDeque.pop() + " ");


    }
}
// F Е D В А