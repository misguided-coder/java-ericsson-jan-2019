package com.example.ex;

/* 
 * Author : Mohan Singh
 * Date : 10st Mar 2019
 * Email : mohan@YAHOO.COM
 */
public class Main {
	
	public static void main(String[] args) {
		
		CinemaService cinemaService = new CinemaService();
		
		try {
			cinemaService.watchMovie("Jaggu", 25);
			System.out.println("Movie is over!!!!");
			cinemaService.watchMovie("Pintu", 8);
			System.out.println("Movie is over!!!!");
			
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
