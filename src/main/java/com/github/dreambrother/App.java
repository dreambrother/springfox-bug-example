package com.github.dreambrother;

import org.springframework.boot.SpringApplication;

public class App {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Config.class);
        springApplication.run(args);
    }
}
