package com.justin.firstspringboot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author justin-zhu
 * <p>
 * 2022年10月05日 14:40
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Hello Spring Boot ,index";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
        return "Spring Boot Test Interface";
    }
}
