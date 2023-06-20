package com.lojo.nameit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Make this class a spring controller api
// Make this class a rest controller
// Make this class a request mapping for the root path 

@RestController
@RequestMapping("/api")
public class DefaultController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/")
    public String root() {
        return "This is the root path";
    }
}
