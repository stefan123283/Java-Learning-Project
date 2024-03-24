package com.stefanfrunzaqa.filemanagementservice;
import java.io.File;
import java.io.IOException;

public class FileManager {

    static boolean createTheFileIfItDoesNotExist(File file) {
        try {
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    static void informIfTheTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file exist");
        } else {
            System.out.println("The file does not exist");
        }
    }

    static void printTheFileName(File file) {
        System.out.println("The file name is " + file.getName());
    }

    static void printTheFileAbsolutePath(File file) {
        System.out.println("The " + file.getName() + " absolute path is: " + "'" + file.getAbsolutePath() + "'");
    }

    static void printIfTheFileIsADirectory(File file) {
        if (file.isDirectory()) {
            System.out.println("The " + file.getName() + " is a directory");
        } else {
            System.out.println("The " + file.getName() + " is not a directory");
        }
    }

    static void deleteTheFileIfExists(File file) {
        if (file.exists()) {
            file.delete();
            System.out.println("The " + file.getName() + " was deleted");
        } else {
            System.out.println("The " + file.getName() + " does not exist");
        }
    }


}