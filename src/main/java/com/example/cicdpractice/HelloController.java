package com.example.cicdpractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @Value("${server.env}")
    private String env;

    @GetMapping("/hello")
    public String hello() {

        log.debug("feat10");

        return "hello nginx testing";
    }

    @GetMapping("/env")
    public String profile() {
        return env;
    }
}
