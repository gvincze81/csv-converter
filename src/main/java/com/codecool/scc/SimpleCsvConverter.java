package com.codecool.scc;

import java.io.File;

public class SimpleCsvConverter {
    FileReader reader = new FileReader();

    public void convert(File filePath, String outputFormat)
    {
        System.out.printf("I convert %s to %s\n", filePath, outputFormat);
        reader.readData(filePath);
    }

    public void convert(File filePath)
    {
        System.out.printf("I convert %s to table\n", filePath);
        reader.readData(filePath);
    }
}
