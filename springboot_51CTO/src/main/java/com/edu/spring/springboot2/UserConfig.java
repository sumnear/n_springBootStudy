package com.edu.spring.springboot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
/**
 * --spring.config.location=classpath:conf/app.properties   可以制定多个，用逗号隔开
 * --spring.config.name 制定默认配置文件名
 * 文件指定的方式  1、 classpath   file
 */
//@PropertySource("classpath:jdbc.properties")
//@PropertySource("file:/e/temp/jdbc.properties")
//@PropertySources({@PropertySource("file:/e/temp/jdbc.properties"),@PropertySource("classpath:jdbc.properties")})
//@ConfigurationProperties(prefix = "aaa")
public class UserConfig {

    @Autowired
    private Environment env;

    @Value("${local.port}")
    private String localPort;

    /**
     *如果没有配置，则用默认值
     */
    @Value("${local.port:9090}")
    private String localPort2;

    public void show(){
        System.out.println("local.ip=" + env.getProperty("local.ip"));
        System.out.println("local.port=" + localPort);

    }
}
