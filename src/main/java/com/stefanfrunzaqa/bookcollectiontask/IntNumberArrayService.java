package com.stefanfrunzaqa.bookcollectiontask;

public class IntNumberArrayService {
    static void getMinimumValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("The minimum value from this array is " + min);
    }

    static void getAverageValue(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The average value of this array is " + sum / array.length);
    }

}