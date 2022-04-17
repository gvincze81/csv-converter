package com.codecool.scc.formatter;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(BufferedReader br) {
        List<List<String>> records = new ArrayList<>();

        try {
            String line;
            while( (line = br.readLine()) != null )
            {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }

            for(List<String> words: records)
            {
                for(String word: words)
                {
                    System.out.printf("%s\t", word);
                }
                System.out.println();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
