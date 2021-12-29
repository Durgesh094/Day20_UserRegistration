package com.bridgelabz.Day20_userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperCase {

	public boolean regex(String upperCase) {
		String regex = "^[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}";

		// Pattern object
		Pattern r = Pattern.compile(regex);
		// matcher object
		Matcher m = r.matcher(upperCase);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	// Main Method
	public static void main(String[] args) {
		UpperCase upperCase = new UpperCase();
		System.out.println(upperCase.regex("XYZmngccc@123"));
		System.out.println(upperCase.regex("X$%<>+#@y=z"));

	}
}
