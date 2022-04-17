package com.codecool.scc.config;

import com.codecool.scc.FileReader;
import com.codecool.scc.SimpleCsvConverter;
import com.codecool.scc.factory.OutputFormatterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public SimpleCsvConverter converter()
    {
        return new SimpleCsvConverter();
    }

    @Bean
    public FileReader fileReader()
    {
        return new FileReader();
    }

    @Bean
    public OutputFormatterFactory off()
    {
        return new OutputFormatterFactory();
    }

}
