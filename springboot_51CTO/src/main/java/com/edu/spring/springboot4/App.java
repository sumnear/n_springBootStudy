package com.edu.spring.springboot4;

import com.edu.spring.springboot1.App2;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan
@Import({User.class,Role.class})
//import 用来导入一个或多个类，会被spring容器托管
//ImportBeanDefinitionRegistrar中registerBeanDefinitions方法的参数有一个BeanDefinitionRegistry，可以用来往spring容器中注入bean
//ImportSelector  selectImports方法的返回值，必须是一个class(全称)，该class会被spring容器托管起来
//@EnableLog(name = "sumnear")
 public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class,args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Role.class));
        context.close();

    }
}
