package com.codecool.scc;

import com.codecool.scc.factory.OutputFormatterFactory;
import com.codecool.scc.formatter.OutputFormatter;

import java.io.File;

public class SimpleCsvConverter {
    FileReader reader = new FileReader();
    OutputFormatterFactory off = new OutputFormatterFactory();

    public void convert(File filePath, String outputFormat)
    {
        System.out.printf("I convert %s to %s\n", filePath, outputFormat);
        reader.readData(filePath);
        OutputFormatter formatter = off.createByFormat(outputFormat);
        if (formatter != null) {
            formatter.printToConsole();
        }
    }

    public void convert(File filePath)
    {
        System.out.printf("I convert %s to table\n", filePath);
        reader.readData(filePath);
        OutputFormatter formatter = off.createByFormat("table");
        if (formatter != null) {
            formatter.printToConsole();
        }
    }
}
