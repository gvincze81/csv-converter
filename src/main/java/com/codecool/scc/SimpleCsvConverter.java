package com.codecool.scc;

import java.nio.file.Path;

public class SimpleCsvConverter {
    public void convert(Path filePath, String outputFormat)
    {
        System.out.printf("I convert %s to %s\n", filePath, outputFormat);
    }

    public void convert(Path filePath)
    {
        System.out.printf("I convert %s to table\n", filePath);
    }
}
