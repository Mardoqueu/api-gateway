package com.challenge.gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuration class for setting up Cross-Origin Resource Sharing (CORS) in a Spring application.
 *
 * This class implements the {@link WebMvcConfigurer} interface to provide custom CORS mappings.
 * By overriding the {@code addCorsMappings} method, it specifies the allowed origins, HTTP methods,
 * headers, and credentials policy for the application.
 *
 * The configuration is applied to all URL paths by using a path pattern of "/**".
 * Requests from the specified origin are permitted to use the specified HTTP methods and headers.
 * Credentials are allowed to be included with requests, facilitating various types of client interaction.
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://calculator-front-chi.vercel.app/")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}