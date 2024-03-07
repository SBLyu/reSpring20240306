package com.sblyu.reSpring20240306;

import org.springframework.stereotype.Component;


public class HpPrinter implements Printer {

    public void print(String message){
        System.out.println("Hp Printer: "+message);
    }
}
