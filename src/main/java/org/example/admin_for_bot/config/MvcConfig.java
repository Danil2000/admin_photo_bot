package org.example.admin_for_bot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/photos/**").setViewName("photos");
        registry.addViewController("/users/**").setViewName("orders");
        registry.addViewController("/contacts/**").setViewName("users");
    }
}