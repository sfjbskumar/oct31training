package com.example.pensionManagementSystem.model.confi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class PensionSecurity extends WebSecurityConfigurerAdapter {
    //private static final String ADMIN = "ADMIN";
    //private static final String NPASS = "{noop}password";

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.httpBasic().and().authorizeRequests()
                //.antMatchers(HttpMethod.GET, "/get/pension").hasAnyRole("ADMIN")
                //.antMatchers(HttpMethod.GET, "/get/all").hasAnyRole("ADMIN")
                //.antMatchers(HttpMethod.GET, "/pension/{id}").hasAnyRole("ADMIN")
                .antMatchers(HttpMethod.POST, "save/pension").hasAnyRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "update/pension").hasAnyRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "remove/pension").hasAnyRole("ADMIN").and().csrf().disable().headers()
                .frameOptions().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user123").password("{noop}password").roles("USER").and()
                .withUser("admin123").password("{noop}password").roles("ADMIN").and().withUser("test123")
                .password("{noop}password").roles("USER").and().withUser("ramashanker").password("{noop}password")
                .roles("ADMIN");
    }

}

