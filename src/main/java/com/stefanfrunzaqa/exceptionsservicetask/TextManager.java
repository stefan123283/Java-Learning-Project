package com.stefanfrunzaqa.exceptionsservicetask;


public class TextManager {

    static int getStringLength1(String text) {
        try {
            return text.length();
        } catch (NullPointerException e) {
            System.out.println("The value should not be null!");
            return 0;
        }
    }

    static int getStringLength2(String text) {
        return text.length();
    }
}