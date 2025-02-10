package com.richardsherrill.website.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WeatherConfig {

    @Bean
    public WebClient weatherClient(@Value("${weatherapi.url}") String url) {
        return WebClient.builder().baseUrl(url).build();
    }

}
