package com.bridgelabz.Day20_userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllEmailSamples {
	public boolean regex(String allEmailSamples) {

		String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";

		// Pattern object
		Pattern r = Pattern.compile(regex);
		// matcher object
		Matcher m = r.matcher(allEmailSamples);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Main Method
	public static void main(String[] args) {
		AllEmailSamples emailSamples = new AllEmailSamples();
		System.out.println(emailSamples.regex("abc@yahoo.com"));
		System.out.println(emailSamples.regex("abc-100@yahoo.com"));
		System.out.println(emailSamples.regex("abc.100@yahoo.com"));
		System.out.println(emailSamples.regex("abc111@abc.com"));
		System.out.println(emailSamples.regex("abc-100@abc.net"));
		System.out.println(emailSamples.regex("abc.100@abc.com.au"));
		System.out.println(emailSamples.regex("abc@1.com"));
		System.out.println(emailSamples.regex("abc@yahoo.com.com"));
		System.out.println(emailSamples.regex("abc+100@yahoo.com"));
	}

}
