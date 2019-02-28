package com.mtm.demo.inet;

import java.net.InetAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InetDemo {
	private static final Logger LOGGER = LoggerFactory.getLogger(InetDemo.class);

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.google.com");

			LOGGER.info("Host Name: " + ip.getHostName());
			LOGGER.info("IP Address: " + ip.getHostAddress());

		} catch (Exception e) {
			LOGGER.error("", e);
		}
	}
}