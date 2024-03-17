package com.stefanfrunzaqa.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        int result = a;
        System.out.println("Simple attribution: " + result);
        result += b;
        System.out.println("Attribution with sum: " + result);
        result -= b;
        System.out.println("Attribution with difference: " + result);
        result *= b;
        System.out.println("Attribution with multiplication: " + result);
        result /= b;
        System.out.println("Attribution with division: " + result);
        result %= b;
        System.out.println("Attribution with rest: " + result);
    }
}