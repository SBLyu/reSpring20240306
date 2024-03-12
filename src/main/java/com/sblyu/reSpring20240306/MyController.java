package com.sblyu.reSpring20240306;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/product")
    public String product(){
        return "第一個是蘋果、第二個是橘子";
    }

    @RequestMapping("/user")
    public String user(){
        return "name is Judy";
    }
}
