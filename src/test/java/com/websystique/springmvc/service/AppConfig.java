package com.websystique.springmvc.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }
}
