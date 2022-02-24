package com.hyuckweb.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName: com.hyuckweb.api
 * fileName   : CorsConfig
 * author     : HYUCK7
 * date       : 2022-02-24
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-24         HYUCK7         최초 생성
 */

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "PATCH", "OPTIONS")
                .allowedHeaders("headers")
                .maxAge(3000);
    }
}