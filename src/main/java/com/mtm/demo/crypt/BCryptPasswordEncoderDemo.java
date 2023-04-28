package com.mtm.demo.crypt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Slf4j
public class BCryptPasswordEncoderDemo {

    public static void main(String[] args) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "123456";
        log.info("Raw password : {}", rawPassword);
        String encodedPassword = passwordEncoder.encode(rawPassword);
        log.info("Encoded password : {}", encodedPassword);
    }

}
