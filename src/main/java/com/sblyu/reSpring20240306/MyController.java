package com.sblyu.reSpring20240306;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test")
    public String test(@RequestBody Student student){

        System.out.println("id: "+student.getId());
        System.out.println("name: "+student.getName());
        return "test OK.";
    }

}
