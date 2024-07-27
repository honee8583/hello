package com.example.cicdpractice;

import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HelloController {
//    @Value("${server.env}")
//    private String env;
//
//    @Value("${server.port}")
//    private String serverPort;
//
//    @Value("${server.serverAddress}")
//    private String serverAddress;
//
//    @Value("${serverName}")
//    private String serverName;

    private final Environment environment;

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("hello2");
    }

    @GetMapping("/hc")
    public ResponseEntity<?> healthCheck() {
        Map<String, String> responseData = new HashMap<>();
//        responseData.put("serverName", serverName);
//        responseData.put("serverAddress", serverAddress);
//        responseData.put("serverPort", serverPort);
//        responseData.put("env", env);
        responseData.put("serverName", environment.getProperty("serverName"));
        responseData.put("serverAddress", environment.getProperty("server.serverAddress"));
        responseData.put("serverPort", environment.getProperty("server.port"));
        responseData.put("env", environment.getProperty("server.env"));

        return ResponseEntity.ok(responseData);
    }

    @GetMapping("/env")
    public ResponseEntity<?> getEnv() {
//        return ResponseEntity.ok(env);
        return ResponseEntity.ok(environment.getProperty("server.env"));
    }
}
