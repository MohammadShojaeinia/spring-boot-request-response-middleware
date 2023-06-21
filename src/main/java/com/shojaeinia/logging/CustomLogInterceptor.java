package com.shojaeinia.logging;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CustomLogInterceptor implements WebMvcConfigurer {
    private final RequestLogInterceptor requestLogInterceptor;

    public CustomLogInterceptor(RequestLogInterceptor requestLogInterceptor) {
        this.requestLogInterceptor = requestLogInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestLogInterceptor);
    }
}