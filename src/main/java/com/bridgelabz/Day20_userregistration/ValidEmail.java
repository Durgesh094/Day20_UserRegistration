package com.bridgelabz.Day20_userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
	public boolean regex(String Email) {
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter Email Id: ");  
		String lastName = sc.nextLine();              //reads string  
		
		String pattern = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";

		//  Pattern object
		Pattern regex = Pattern.compile(pattern);
		
		//matcher object
		Matcher m = regex.matcher(Email);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Main method
	public static void main(String[] args) {
		ValidEmail email = new ValidEmail();
		System.out.println(email.regex("xyz@abc.com"));
	}
}