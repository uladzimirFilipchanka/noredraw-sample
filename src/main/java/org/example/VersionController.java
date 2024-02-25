package org.example;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    private static final Logger logger = LoggerFactory.getLogger(VersionController.class);

    @Value("${info.build.version}")
    private String version;

    @PostConstruct
    private void printVersion() {
        // easily check version in logs
        logger.info("You deployed me well! My version is {}", version);
    }

    @GetMapping("/version")
    public String helloWorld() {
        return version;
    }
}