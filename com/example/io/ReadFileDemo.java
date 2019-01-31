package com.example.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileDemo {
	
	public static void main(String[] args) {
		
		//readUsingByteBasedStream();
		//readUsingCharBasedStream();
		readUsingLineByLine();
	}
	

	private static void readUsingLineByLine() {
		try {
		
			//Open file in read mode
			FileInputStream fis = new FileInputStream("C:/files/cricket.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			//Close streams after reading is done
			br.close();
			isr.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	
	
	private static void readUsingCharBasedStream() {
		try {
		
			//Open file in read mode
			FileInputStream fis = new FileInputStream("C:/files/cricket.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			
			char[] array = new char[10];
			
			isr.read(array);
			
			System.out.println(array);
			
			//Close streams after reading is done
			isr.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	

	private static void readUsingByteBasedStream() {
		try {
		
			//Open file in read mode
			FileInputStream fis = new FileInputStream("C:/files/cricket.txt");
			
			//Read entire data from file
			int asciiCode = fis.read();
			
			while(asciiCode != -1) {
				System.out.print((char)asciiCode);
				asciiCode = fis.read();
			}
			
			
			//Close file after reading is done
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
