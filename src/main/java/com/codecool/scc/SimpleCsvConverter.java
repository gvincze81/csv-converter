package com.codecool.scc;

import com.codecool.scc.factory.OutputFormatterFactory;
import com.codecool.scc.formatter.OutputFormatter;

import java.io.File;
import java.util.List;

public class SimpleCsvConverter {
    private FileReader reader;
    private OutputFormatterFactory off;

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

    public void setReader(FileReader reader)
    {
        this.reader = reader;
    }

    public void setOff(OutputFormatterFactory off) {
        this.off = off;
    }
}
