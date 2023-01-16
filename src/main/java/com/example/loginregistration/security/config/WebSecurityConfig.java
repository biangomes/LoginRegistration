package com.example.loginregistration.security.config;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf().disable().authorizeHttpRequests((auth) -> auth.anyRequest().permitAll());

        //http.authorizeHttpRequests((auth) -> auth.anyRequest().authenticated()).httpBasic(withDefaults());

        return http.build();
    }
}
