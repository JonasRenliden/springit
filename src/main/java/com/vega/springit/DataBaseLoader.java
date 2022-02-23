package com.vega.springit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class DataBaseLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //Do some dateabase work
        System.out.println("Database loader...");
    }
}
