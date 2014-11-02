package com.letsdeveloper.java8.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TryWithExample1Old {

	public static List<String> readLines(File file) throws IOException {
		BufferedReader oin = null;
		try {
			List<String> lines = new java.util.ArrayList<String>();

			oin = new BufferedReader(new  InputStreamReader(new FileInputStream(file)));
			String line;
			while ((line = oin.readLine()) != null) {
				lines.add(line);
			}

			return lines;
		} finally {
			if (oin != null) {
				try {
					// close() can throw an exception
					oin.close();
				} catch(IOException ioe) {
					// supress or log
				}
			}
		}
	}
}
