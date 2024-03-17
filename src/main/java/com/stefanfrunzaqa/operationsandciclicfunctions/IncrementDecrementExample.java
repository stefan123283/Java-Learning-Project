package com.stefanfrunzaqa.operationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println("Value after increment: a = " + a + ", b = " + b);
        b = ++a;
        System.out.println("Value after pre-increment: a = " + a + ", b = " + b);
        b = a--;
        System.out.println("Value after decrement: a = " + a + ", b = " + b);
        b = --a;
        System.out.println("Value after pre-decrement: a = " + a + ", b = " + b);
    }
}

