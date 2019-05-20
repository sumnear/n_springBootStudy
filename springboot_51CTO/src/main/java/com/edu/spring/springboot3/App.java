package com.edu.spring.springboot3;

import com.edu.spring.springboot2.TomcatProperties;
import com.edu.spring.springboot2.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class App {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        //1编程方式指定
//        app.setAdditionalProfiles("dev");
        //2 --spring.profiles.active=dev
        //sprinmg.profiles=test 只激活一个profile,默认的不激活(不影响其他配置文件
        ConfigurableApplicationContext context = app.run(args);
        System.out.println(context.getEnvironment().getProperty("jdbc.url"));
        context.close();
    }
}
