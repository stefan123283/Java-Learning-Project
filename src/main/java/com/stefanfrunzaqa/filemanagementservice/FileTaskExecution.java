package com.stefanfrunzaqa.filemanagementservice;
import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        String filepath = "src/main/java/com/stefanfrunzaqa/filemanagementservice/file.txt";

        File file = new File(filepath);
        System.out.println(FileManager.createTheFileIfItDoesNotExist(file));
        FileManager.informIfTheTheFileExists(file);
        FileManager.printTheFileName(file);
        FileManager.printTheFileAbsolutePath(file);
        FileManager.printIfTheFileIsADirectory(file);
        FileManager.deleteTheFileIfExists(file);

        OutputFileWriterManager.writeContentIntoFileUsingFileWriter(filepath, "Some text");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(filepath, "Different text");

        InputFileReadManager.printDataFromAFile(file);
        InputFileReadManager.printDataFromAFileUsingBufferReader(file);
        InputFileReadManager.printDataFromAFileUsingFiles(file);
    }
}