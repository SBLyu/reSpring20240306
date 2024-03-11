package com.sblyu.reSpring20240306;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer {

    @Value("${printer.name}")
    private String name;

    @Value("${printer.count:3}")
    private int count;

    public void print(String message){
        count--;
        System.out.println(name+" : "+message);
        System.out.println("count: "+count);
    }
}
