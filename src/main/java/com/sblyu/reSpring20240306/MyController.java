package com.sblyu.reSpring20240306;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test")
    public String test(@RequestHeader String info){
        System.out.println("info: "+info);

        return "test OK.";
    }

}
