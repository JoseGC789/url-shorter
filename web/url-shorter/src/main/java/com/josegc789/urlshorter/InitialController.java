package com.josegc789.urlshorter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shorter")
public class InitialController {

    @GetMapping
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("{\"field\":\"ok\"}");
    }
}
