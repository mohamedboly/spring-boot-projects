package com.numeriquepro.quickstart;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello Devtiro!";
    }
}
