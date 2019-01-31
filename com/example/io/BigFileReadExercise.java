package com.example.io;

import java.io.FileInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigFileReadExercise {

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();
			readByNIO();
		long endTime = System.nanoTime();
		System.out.printf("Total Time Taken  : %s ms!!!!", ((endTime - startTime) / 1000));

		startTime = System.nanoTime();
			readByIO();
		endTime = System.nanoTime();
		System.out.printf("Total Time Taken  : %s ms!!!!", ((endTime - startTime) / 1000));

		
	}

	private static void readByIO() throws Exception {

		FileInputStream fis = new FileInputStream("C:/files/cricket.txt");
		int asciiCode = fis.read();
		while (asciiCode != -1) {
			//System.out.print((char) asciiCode);
			asciiCode = fis.read();
		}
		fis.close();
	}

	private static void readByNIO() throws Exception {

		Path filePath = FileSystems.getDefault().getPath("C:/files/", "cricket.txt");
		byte[] byteArray = Files.readAllBytes(filePath);
		//System.out.println(new String(byteArray, "UTF-8"));
	}
}
