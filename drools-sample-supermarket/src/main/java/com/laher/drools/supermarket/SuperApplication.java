package com.laher.drools.supermarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author laher
 * @date 2020/10/15/015
 */
@SpringBootApplication(scanBasePackages = "com.laher")
public class SuperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SuperApplication.class, args);
    }
}
