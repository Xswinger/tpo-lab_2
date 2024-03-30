package com.xswinger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Parser {

    private final String path = "./output/";

    public void pars(double value, double res, String filename) {
        String data = value + " " + res;
        write(data, filename);
    }

    private void write(String data, String filename) {
        try {
            File file = new File(path + filename);
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

}
