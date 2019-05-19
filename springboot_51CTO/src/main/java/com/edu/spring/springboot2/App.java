package com.edu.spring.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
//        System.out.println(context.getEnvironment().getProperty("local.ip"));
        //2
        context.getBean(UserConfig.class).show();

        System.out.println(context.getBean(TomcatProperties.class));

        context.close();

    }
}
