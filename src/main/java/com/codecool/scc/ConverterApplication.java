package com.codecool.scc;

import java.nio.file.Path;
import java.util.Optional;

public class ConverterApplication {
    private static final SimpleCsvConverter converter = new SimpleCsvConverter();
    public static void main(String[] args) {
        Path path;
        Optional<String> format;
        if(args.length == 0)
        {
            System.out.println("No input file defined!");
            return;
        }

        if(args.length == 1)
        {
            path = Path.of(args[0]);
            converter.convert(path);
            return;
        }

        path = Path.of(args[1]);
        format = Optional.of(args[0]);
        converter.convert(path, format.get());

    }
}
