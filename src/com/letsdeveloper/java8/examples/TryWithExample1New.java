package com.letsdeveloper.java8.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TryWithExample1New {

	public static List<String> readLines(File file) throws IOException {
		try (BufferedReader oin = new BufferedReader(new  InputStreamReader(new FileInputStream(file)))) {
			List<String> lines = new java.util.ArrayList<String>();

			String line;
			while ((line = oin.readLine()) != null) {
				lines.add(line);
			}

			return lines;
		}
	}
}
