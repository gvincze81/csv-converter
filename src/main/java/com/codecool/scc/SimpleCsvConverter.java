package com.codecool.scc;

import com.codecool.scc.factory.OutputFormatterFactory;
import com.codecool.scc.formatter.OutputFormatter;

import java.io.BufferedReader;
import java.io.File;

public class SimpleCsvConverter {
    FileReader reader = new FileReader();
    OutputFormatterFactory off = new OutputFormatterFactory();

    public void convert(File filePath, String outputFormat)
    {
        BufferedReader br = reader.readData(filePath);
        OutputFormatter formatter = off.createByFormat(outputFormat);
        if (formatter != null) {
            formatter.printToConsole(br);
        }
    }

    public void convert(File filePath)
    {
        BufferedReader br = reader.readData(filePath);
        OutputFormatter formatter = off.createByFormat("table");
        if (formatter != null) {
            formatter.printToConsole(br);
        }
    }
}
