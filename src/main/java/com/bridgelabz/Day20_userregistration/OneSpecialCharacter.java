package com.bridgelabz.Day20_userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OneSpecialCharacter {
	public boolean regex(String specialCharacter) {
		String regex = "^[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}";

		// Pattern object
		Pattern r = Pattern.compile(regex);
		// matcher object
		Matcher m = r.matcher(specialCharacter);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		OneSpecialCharacter specialCharacter = new OneSpecialCharacter();
		System.out.println(specialCharacter.regex("XYZmngccc@123abc"));
		System.out.println(specialCharacter.regex("Xyz#123abcd"));

	}
}
