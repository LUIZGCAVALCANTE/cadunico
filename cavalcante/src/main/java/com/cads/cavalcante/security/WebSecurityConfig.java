package com.cads.cavalcante.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.authorization.SingleResultAuthorizationManager.permitAll;

public class WebSecurityConfig  {

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {


        //desablecsrf
        http.csrf(csrf -> csrf.disable());
        //libera requisicoes gerais
        http.authorizeHttpRequests((authorize) -> authorize.anyRequest().
        permitAll());

        return http.build();

    }




}

