package com.shojaeinia.logging;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.HandlerInterceptor;

public class RequestLogInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (
                request.getMethod().equals(HttpMethod.GET.name()) ||
                        request.getMethod().equals(HttpMethod.DELETE.name()) ||
                        request.getMethod().equals(HttpMethod.PUT.name())
        ) {
            // Do whatever you need with the request
            System.out.println("Hello");
        }

        return true;
    }
}