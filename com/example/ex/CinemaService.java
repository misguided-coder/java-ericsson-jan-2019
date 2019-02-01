package com.example.ex;

/* A business class used for providing 
 *  cinema related functionalities.
 * */
/*
 * Author : Ritesh Tyagi
 * Date : 1st Feb 2019
 * Email : HI2TYAGI@YAHOO.COM
 */
public class CinemaService {

	public boolean watchMovie(String name, int age) throws InvalidAgeException {
		if (age <= 10) {
			throw new InvalidAgeException("Go home, your age is only " + age + " yrs old.");
		}
		System.out.printf("Hello Mr. %s , Go ahead and enjoy the movie as you are %s yrs old.%n", name, age);
		return true;
	}
}
