package com.mtm.demo.inet;

import java.net.InetAddress;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class InetDemo {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.google.com");

			log.info("Host Name: " + ip.getHostName());
			log.info("IP Address: " + ip.getHostAddress());

		} catch (Exception e) {
			log.error("", e);
		}
	}
}