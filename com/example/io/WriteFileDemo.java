package com.example.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteFileDemo {

	public static void main(String[] args) {

		//writeToFileByByteBasedStream();
		writeToFileByCharBasedStream();

	}

	private static void writeToFileByCharBasedStream() {
		
		try {

			// Open file in append mode
			FileOutputStream fos = new FileOutputStream("C:/files/holidays.txt",true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			
			//char[] data = {'R','i','t','e','s','h'};
			//osw.write(data);	
			
			String data = "Lets go to Maldivas for 2 year long holiday!!!";
			
			osw.write(data);
			osw.write("\n");
			
			// Close streams after writing is done
			osw.close();
			fos.close();

			System.out.println("Done Writing!!!!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeToFileByByteBasedStream() {
		try {

			// Open file in write mode
			FileOutputStream fos = new FileOutputStream("C:/files/holidays.txt");

			int singleByte = 104;

			fos.write(singleByte);

			// Close file after writing is done
			fos.close();

			System.out.println("Done Writing!!!!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
