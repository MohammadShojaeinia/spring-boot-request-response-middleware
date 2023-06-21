package com.shojaeinia.util;

public class IdGenerator {
    public static synchronized String generateId() {
        return String.format("%s", System.currentTimeMillis());
    }
}
