package com.sblyu.reSpring20240306;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public Printer myPrinter(){
        return new HpPrinter();
    }

    @Bean
    public Printer yourPrinter(){
        return new CanonPrinter();
    }
}
