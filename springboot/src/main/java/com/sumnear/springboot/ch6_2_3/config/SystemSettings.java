package com.sumnear.springboot.ch6_2_3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @authore sumnear
 * @create 2019-2-27 14:15
 */
@Component
@ConfigurationProperties(prefix ="sys",locations = "classpath:config.properties")
public class SystemSettings
{
   private String path ;

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }
}
