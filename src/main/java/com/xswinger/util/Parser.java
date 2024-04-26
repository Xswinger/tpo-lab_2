package com.xswinger.util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Parser {

    private final String path = "src/main/java/com/xswinger/output/";
    private File file;

    public Parser(String filename) {
        file = new File(path + filename);
    }

    public void parsLine(double value, double res) {
        String data = value + ", " + res;
        write(data);
    }

    public void parsArray(Double[] values, Double[] results) {
        String data = "";
        for (int i = 0; i < values.length; i++) {
            data += Double.toString(values[i]) + ", " +  Double.toString(results[i]) + "\n";
        }
        write(data);
    }

    private void write(String data) {
        try {
            file.createNewFile();
            
            FileWriter writer = new FileWriter(file, false);
            writer.write(data);
            writer.append('\n');

            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String read() {
        try {
            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(reader);

            String line = scanner.nextLine();

            scanner.close();
            reader.close();

            return line;

        } catch (IOException e) {
            return e.getMessage();
        }
    }

}
