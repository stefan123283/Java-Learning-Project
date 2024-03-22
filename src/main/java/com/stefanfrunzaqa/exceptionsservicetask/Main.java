package com.stefanfrunzaqa.exceptionsservicetask;

public class Main {
    public static void main(String[] args) {
        System.out.println(TextManager.getStringLength1(null));
        System.out.println(TextManager.getStringLength2(null));
        System.out.println(ArithmeticOperationService.divide1(5, 0));
        System.out.println(ArithmeticOperationService.divide2(5, 0));
    }
}