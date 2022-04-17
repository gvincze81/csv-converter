package com.codecool.scc.factory;

import com.codecool.scc.formatter.JsonOutputFormatter;
import com.codecool.scc.formatter.OutputFormatter;
import com.codecool.scc.formatter.TableOutputFormatter;
import com.codecool.scc.formatter.XmlOutputFormatter;

public class OutputFormatterFactory {
    public OutputFormatter createByFormat(String format)
    {
        if(format.equalsIgnoreCase("table"))
        {
            return new TableOutputFormatter();
        }
        else if(format.equalsIgnoreCase("json"))
        {
            return new JsonOutputFormatter();
        }
        else if(format.equalsIgnoreCase("xml"))
        {
            return new XmlOutputFormatter();
        }
        return null;
    }
}
