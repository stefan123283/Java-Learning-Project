package com.stefanfrunzaqa.operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean result = a && b;
        System.out.println("true && false: " + result);
        result = a || b;
        System.out.println("true || false: " + result);
        result = !a;
        System.out.println("!true: " + result);
        result = !!b;
        System.out.println("!!false: " + result);
    }
}