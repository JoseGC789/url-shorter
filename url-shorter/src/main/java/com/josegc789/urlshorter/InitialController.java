package com.josegc789.urlshorter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shorter")
public class InitialController {

    @GetMapping
    public String test(){
        return "I'm an url shorter";
    }
}
