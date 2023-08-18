package com.pdfTokenLastDance.pdfToken.config;

import com.pdfTokenLastDance.pdfToken.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class SpringSecurity {

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(UserService userService){
        DaoAuthenticationProvider auth=new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(passwordEncoder());
        return  auth;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{

        http.authorizeHttpRequests()
                .requestMatchers("/login").permitAll()
                .anyRequest().denyAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        return http.build();
    }
}
/*http.authorizeHttpRequests()
                .requestMatchers("/login").permitAll()
                .anyRequest().denyAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        return http.build();*/
