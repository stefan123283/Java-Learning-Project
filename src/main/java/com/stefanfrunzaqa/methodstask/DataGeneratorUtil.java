package com.stefanfrunzaqa.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    private static Random random = new Random();

    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            System.out.println("The minimum value should be larger than the maximum value.");
            return 0;
        }
        int delta = max - min;
        int deltaRandomInt = random.nextInt(delta);
        return deltaRandomInt + min;

    }

    public static int getRandomInt(int limit) {
        return random.nextInt(limit);
    }

    public static String getRandomEmail() {
        String uuid = UUID.randomUUID().toString();
        String domain = "@malinator.com";
        return uuid + domain;
    }

    public static String generateRandomString(int length) {
        String acceptedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz" + "0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
}