package com.qq.freemakerdemo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class FreemakerConfig {

    @Value("${person.name}")
    private String name;
    @Value("${person.password}")
    private String pwd;
    @Value("${person.address}")
    private String address;


}
