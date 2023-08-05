package com.jgj.byl_process.domain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:8080", "http://localhost:8080", "http://15.165.2.78", "http://ec2-15-165-2-78.ap-northeast-2.compute.amazonaws.com", "http://byl.kro.kr")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
