package com.edu.spring.springboot2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("ds")
public class TomcatProperties {

    private List<String> hosts = new ArrayList<>();

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    @Override
    public String toString() {
        return "TomcatProperties{" +
                "hosts=" + hosts +
                '}';
    }
}
