package com.codecool.scc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReader {

    public BufferedReader readData(File file) {

        BufferedReader br;
        try {
            br = new BufferedReader(new java.io.FileReader(file));
            System.out.println("File successfully read.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return br;
    }

}
