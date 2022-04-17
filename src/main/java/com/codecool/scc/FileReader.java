package com.codecool.scc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader {

    public List<List<String>> readData(File file) {
        List<List<String>> records = new ArrayList<>();

        BufferedReader br;
        try {
            br = new BufferedReader(new java.io.FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        return records;
    }

}
