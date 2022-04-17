package com.codecool.scc.formatter;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(List<List<String>> records) {


            for(List<String> words: records)
            {
                for(String word: words)
                {
                    System.out.printf("%s\t", word);
                }
                System.out.println();
            }

    }
}
