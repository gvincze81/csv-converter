package com.codecool.scc.formatter;

import java.util.List;

public class XmlOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(List<List<String>> records) {

        System.out.println("<table>");
        for(int i = 1; i < records.size(); i++)
        {
            System.out.println("\t<line>");
            for(int j = 0; j < records.get(i).size(); j++)
            {
                System.out.printf("\t\t<%1$s>%2$s</%1$s>\n", records.get(0).get(j), records.get(i).get(j));
            }
            System.out.println("\t</line>");
        }
        System.out.println("</table>");

    }
}
