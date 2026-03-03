package com.example.project_login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// @EnableWebSecurity desactivado en rama feature/api-test
import org.springframework.security.web.SecurityFilterChain;

@Configuration
// @EnableWebSecurity - DESACTIVADO
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authz -> authz
                .anyRequest().permitAll()
            );
        
        return http.build();
    }
}
