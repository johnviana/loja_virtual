package com.lojavirtual.apploja.ConfigSecurity;

import com.lojavirtual.apploja.domain.services.ImplentacaoUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebConfigSecurity {

    @Autowired
    private ImplentacaoUserDetailsService implentacaoUserDetailsService;

    // ira consultar usuario no banco de dados
    @Bean
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(implentacaoUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .requestMatchers(HttpMethod.GET, "/salvarAcesso", "/deletaAcesso").permitAll()
                .requestMatchers(HttpMethod.POST, "/salvarAcesso", "/deleteAcesso").permitAll()
                .anyRequest().authenticated();

        return http.build();
    }
}


