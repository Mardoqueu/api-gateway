package com.challenge.gateway.config;

import com.challenge.gateway.exception.CustomFeignErrorDecoder;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Configuration class for Feign clients.
 *
 * This class provides custom configuration for Feign clients,
 * specifically for customizing the request and error handling behavior.
 */
@Configuration
public class FeignConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
                ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                if (attributes != null) {
                    String authorization = attributes.getRequest().getHeader("Authorization");
                    if (authorization != null && !authorization.isEmpty()) {
                        template.header("Authorization", authorization);
                    }
                }
            }
        };
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomFeignErrorDecoder();
    }
}
