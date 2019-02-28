package com.mtm.demo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class ConvertByteArrayToString {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String inputString = "This is an example";
		byte[] bytes = inputString.getBytes();

		System.out.println("Text : " + inputString);

		// This will print the hashcode of the byte array
		System.out.println("Text [Byte Format] : " + bytes);

		// This will print the hashcode of the byte array
		System.out.println("Text [Byte Format] : " + bytes.toString());

		// This actually converts the bytes to String
		String bytesAsString = new String(bytes, StandardCharsets.UTF_8);
		System.out.println("Text Decryted : " + bytesAsString);

	}
}