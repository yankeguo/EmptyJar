package com.yankeguo.emptyjar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String actionIndex() {
        return "Hello World from EmptyJar";
    }

}
