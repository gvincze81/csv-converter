package com.codecool.scc.formatter;

import java.io.BufferedReader;

public class JsonOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(BufferedReader br) {
        System.out.println("Print in json format");
    }
}
