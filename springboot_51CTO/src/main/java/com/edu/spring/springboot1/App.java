package com.edu.spring.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
public class App {
    @Bean
    public Runnable createRunnable(){
        return () -> System.out.println("spring boot is run");
    }


    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        //2
//        ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
        //3
//        SpringApplication app = new SpringApplication();
//        Set<String> set = new HashSet<>();
//        set.add(App2.class.getName());
//        app.setSources(set);
        //4
        SpringApplication app = new SpringApplication(App2.class);

        ConfigurableApplicationContext context = app.run(args);
        context.getBean(Runnable.class).run();;
    }
}
