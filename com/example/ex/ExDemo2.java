package com.example.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExDemo2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream("C:/files/cricket.txt");
			int asciiCode = fis.read();
			System.out.println((char) asciiCode);

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Released file resource lock!!!!!");
		}

	}

}
