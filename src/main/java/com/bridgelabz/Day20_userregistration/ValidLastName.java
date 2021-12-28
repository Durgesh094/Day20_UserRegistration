package com.bridgelabz.Day20_userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLastName {
	public boolean regex() {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter Last Name: ");  
		String lastName = sc.nextLine();              //reads string   
		
		// Pattern 
		String pattern = "^[A-Z][a-z]{3,}$";

// Pattern object
		Pattern regex = Pattern.compile(pattern);

//  matcher object
		Matcher m = regex.matcher(lastName);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Main method
	public static void main(String[] args) {
		ValidLastName lName = new ValidLastName();
		System.out.println(lName.regex());
	

}

}
