package com.mtm.demo.crypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BCryptPasswordEncoderDemo {

	public static void main(String[] args) {

		String pwd = "123456";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(pwd);

		log.info(hashedPassword);
	}

}
