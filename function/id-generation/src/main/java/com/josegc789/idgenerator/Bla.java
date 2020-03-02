package com.josegc789.idgenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generate")
public class Bla {

    private final IdRepo repo;

    public Bla(IdRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/{content}")
    public String abb(@PathVariable("content") String content){
        repo.save(new TestEnmtin(content));
        return "Done";
    }
}
