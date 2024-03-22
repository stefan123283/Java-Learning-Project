package com.stefanfrunzaqa.exceptionsservicetask;

public class ArithmeticOperationService {
    static int divide1(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Please make sure the values are appropriate!");
            return 0;
        }

    }

    static int divide2(int a, int b) {
        return a / b;
    }
}