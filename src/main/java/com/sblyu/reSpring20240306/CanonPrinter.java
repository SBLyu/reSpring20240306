package com.sblyu.reSpring20240306;

import org.springframework.stereotype.Component;


public class CanonPrinter implements Printer {

    public void print(String message){
        System.out.print("Canon Printer: "+message);
    }
}
