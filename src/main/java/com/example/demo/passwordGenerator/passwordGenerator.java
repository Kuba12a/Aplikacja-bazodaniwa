package com.example.demo.passwordGenerator;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "user3";
        String encodedPassword = encoder.encode(rawPassword);

        System.out.println(encodedPassword);
    }

}
