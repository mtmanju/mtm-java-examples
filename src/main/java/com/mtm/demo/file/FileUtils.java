package com.mtm.demo.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains the custom file utility actions.
 * 
 * @author ManjunathMT
 *
 */

@Slf4j
public final class FileUtils {


	private FileUtils() {
	}

	public static String getFileContent(String fileName) throws IOException {
		log.info("getFileContent() --> ");
		try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
				BufferedReader bufReader = new BufferedReader(
						new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {

			StringBuilder strBuilder = new StringBuilder();
			String line = bufReader.readLine();
			while (null != line) {
				strBuilder.append(line).append("\n");
				line = bufReader.readLine();
			}
			return strBuilder.toString();
		} finally {
			log.info("<-- getFileContent()");
		}

	}

}