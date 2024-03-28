package com.sblyu.reSpring20240306;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test")
    public String test(@RequestParam Integer id){
        System.out.println("id: "+id);
        return "test OK.";
    }

}
