package org.example;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //copying here
        File sourceFile = new File("C:\\Users\\mahmo\\Desktop\\source.txt");


        File destinationFile = new File("C:\\Users\\mahmo\\Desktop\\destination.txt");

        try {
            FileUtils.copyFile(sourceFile, destinationFile);
