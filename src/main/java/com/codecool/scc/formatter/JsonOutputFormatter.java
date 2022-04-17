package com.codecool.scc.formatter;

import java.util.List;

public class JsonOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(List<List<String>> records) {
        int tabs = 0;

        System.out.println("[");
        for(int i = 1; i < records.size(); i++)
        {
            System.out.println("\t{");
            for(int j = 0; j < records.get(i).size(); j++)
            {
                System.out.printf("\t\t%s: %s,\n", records.get(0).get(j), records.get(i).get(j));
            }
            System.out.println("\t},");
        }
        System.out.println("]");

    }
}
