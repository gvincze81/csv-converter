package com.codecool.scc;

import java.io.File;
import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConverterApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SimpleCsvConverter converter = context.getBean("converter", SimpleCsvConverter.class);

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
