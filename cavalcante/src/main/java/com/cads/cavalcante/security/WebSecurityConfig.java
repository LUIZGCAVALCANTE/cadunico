package com.cads.cavalcante.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.authorization.SingleResultAuthorizationManager.permitAll;
@Configuration
public class WebSecurityConfig  {

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {

        //libera requisicoes gerais

        http
                .httpBasic(basic ->{}).
                authorizeHttpRequests(authorize->
                        authorize.anyRequest().authenticated())
                .csrf(csrf->csrf.disable());

        return http.build();

    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder)
    {

        UserDetails user =  User.builder()
                .username("Luiz")
                .password(passwordEncoder.encode("12102026"))
                .roles("ADMIN")
                .build();


        return new InMemoryUserDetailsManager(user);



    }
    @Bean
    public PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }




}

