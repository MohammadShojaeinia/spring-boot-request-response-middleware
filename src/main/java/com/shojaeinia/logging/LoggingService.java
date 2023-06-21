package com.shojaeinia.logging;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class LoggingService {
    public void requestLogger(HttpServletRequest request, Object body) {

    }

    public void responseLogger(HttpServletRequest request, HttpServletResponse response, Object body) {

    }

    private Map<String, String> getHeaders(HttpServletResponse response) {
        return null;
    }

    private Map<String, String> getParameters(HttpServletRequest request) {
        return null;
    }
}
