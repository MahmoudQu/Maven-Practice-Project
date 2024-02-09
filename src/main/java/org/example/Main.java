package org.example;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        File sourceFile = new File("C:\\Users\\mahmo\\Desktop\\test.txt");
        File destinationFile = new File("C:\\Users\\mahmo\\Desktop\\destination.txt");

        try {
            FileUtils.copyFile(sourceFile, destinationFile);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}