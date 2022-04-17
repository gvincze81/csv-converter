package com.codecool.scc;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Optional;

public class ConverterApplication {

    public static void main(String[] args) {
        SimpleCsvConverter converter = new SimpleCsvConverter();
        File path;
        Optional<String> format;
        if(args.length == 0)
        {
            System.out.println("No input file defined!");
            return;
        }

        if(args.length == 1)
        {
            path = new File(args[0]);
            converter.convert(path);
            return;
        }

        path = new File(args[1]);
        format = Optional.of(args[0]);
        converter.convert(path, format.get());

    }
}
