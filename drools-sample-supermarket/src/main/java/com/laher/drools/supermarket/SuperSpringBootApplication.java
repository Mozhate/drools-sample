package com.laher.drools.supermarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动项
 * <p>
 *
 * @author laher
 * @version 1.0.0
 * @date 2020/10/14
 */
@SpringBootApplication(scanBasePackages = "com.laher")
public class SuperSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SuperSpringBootApplication.class, args);
    }
}
