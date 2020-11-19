package com.episenscaapeback.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class OrderWriter {

    public static String fileName = "orders.txt";

    public static void writeInFile(String order) {
        order += System.lineSeparator();
        try {
            try {
                Files.write(Paths.get("orders.txt"), order.getBytes(), StandardOpenOption.APPEND);
            }
            catch(NoSuchFileException nf) {
                FileWriter fileWriter = new FileWriter("orders.txt");
                fileWriter.write(order);
                fileWriter.close();
            }
        }catch(IOException io) {
            io.printStackTrace();
        }
    }
}
