package com.codecool.scc;

import com.codecool.scc.factory.OutputFormatterFactory;
import com.codecool.scc.formatter.OutputFormatter;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;

public class SimpleCsvConverter {
    FileReader reader = new FileReader();
    OutputFormatterFactory off = new OutputFormatterFactory();

    public void convert(File filePath, String outputFormat)
    {
        List<List<String>> records = reader.readData(filePath);
        OutputFormatter formatter = off.createByFormat(outputFormat);
        if (formatter != null) {
            formatter.printToConsole(records);
        }
    }

    public void convert(File filePath)
    {
        List<List<String>> records = reader.readData(filePath);
        OutputFormatter formatter = off.createByFormat("table");
        if (formatter != null) {
            formatter.printToConsole(records);
        }
    }
}
