package com.letsdeveloper.java8.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithExample2New {

	public static void copyFile(File from, File to) throws IOException {
		try (
				InputStream input = new FileInputStream(from);
				OutputStream output = new FileOutputStream(to)
			) {
			
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = input.read(buf)) > 0) {
				output.write(buf, 0, bytesRead);
			}
		}
	}
}
