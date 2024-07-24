package com.example.cicdpractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {

        log.debug("hello sl4j");
        log.debug("feat9");
        log.debug("feat10");

        return "hello";
    }
}
