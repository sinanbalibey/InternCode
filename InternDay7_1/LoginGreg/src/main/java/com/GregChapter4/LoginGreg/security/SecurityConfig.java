package com.GregChapter4.LoginGreg.security;


import com.GregChapter4.LoginGreg.repository.UserManagementRepository;
import com.GregChapter4.LoginGreg.repository.UserManagerRepository;
import com.GregChapter4.LoginGreg.repository.UserRepository;
import com.sun.net.httpserver.HttpsServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.stream.Stream;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userService(UserRepository repo){
        return username -> repo.findByUsername(username)
                .asUser();
    }
    @Bean
    CommandLineRunner initUsers(UserManagementRepository repository){
        return args -> {
            repository.save(new User("alice","password","ROLE_USER"));
            repository.save(new User("bob","password","ROLE_USER"));
            repository.save(new User("admin","password","ROLE_ADMIN"));
        };
    }
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)throws Exception{
        http.authorizeHttpRequests() //
                .requestMatchers("/login").permitAll() //
                .requestMatchers("/", "/search").authenticated() //
                .requestMatchers(HttpMethod.GET, "/api/**")
                .authenticated() //
                .requestMatchers(HttpMethod.POST, "/new-video",
                        "/api/**").hasRole("ADMIN") //
                .anyRequest().denyAll() //
                .and() //
                .formLogin() //
                .and() //
                .httpBasic();
        return http.build();
    }



}
