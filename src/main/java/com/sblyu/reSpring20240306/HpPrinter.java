package com.sblyu.reSpring20240306;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer {

    private int count;

    @PostConstruct
    public void init(){
        count=5;
    }

    public void print(String message){
        count--;
        System.out.println("Hp Printer: "+message);
        System.out.println("count: "+count);
    }
}
