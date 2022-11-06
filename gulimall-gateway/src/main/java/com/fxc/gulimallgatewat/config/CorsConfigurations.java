package com.fxc.gulimallgatewat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author FXC
 * @version 1.0
 * @date 2022/8/15 14:47
 */
@Configuration
public class CorsConfigurations {

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfigurations = new CorsConfiguration();

        corsConfigurations.addAllowedHeader("*");
        corsConfigurations.addAllowedMethod("*");
        corsConfigurations.addAllowedOrigin("*");
        corsConfigurations.setAllowCredentials(true);


        source.registerCorsConfiguration("/**", corsConfigurations);

        return new CorsWebFilter(source);
    }
}
