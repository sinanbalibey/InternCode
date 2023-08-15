package com.GregChapter4.LoginGreg;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService userService(UserRepository repo){
        return username -> repo.findByUsername(username)
                .asUser();

    }

   @Bean
   CommandLineRunner initUsers(UserManagmentRepository repository){
        return args -> {
            repository.save(new UserAccount("alice","password","ROLE_USER"));
            repository.save(new UserAccount("bob","password","ROLE_USER"));
            repository.save(new UserAccount("admin","password","ROLE_ADMIN"));
        };
    }

    @Bean
    SecurityFilterChain configureSecurity(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests()
                .requestMatchers("/login").permitAll()
                .requestMatchers("/","/search").authenticated()
                .requestMatchers(HttpMethod.GET,"/api/**").authenticated()
                .requestMatchers(HttpMethod.POST,"/new-video","/api/**").hasRole("ADMIN")
                .anyRequest().denyAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        return http.build();
    }
}
