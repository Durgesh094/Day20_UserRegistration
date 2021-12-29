package com.bridgelabz.Day20_userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedPasswordRules {
	public boolean regex(String passWord) {
		String regex = "^[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}";

		// Pattern object
		Pattern r = Pattern.compile(regex);
		// matcher object
		Matcher m = r.matcher(passWord);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	// Main Method
	public static void main(String[] args) {
		PreDefinedPasswordRules passWord = new PreDefinedPasswordRules();
		System.out.println(passWord.regex("XYZmngccc@123"));
		System.out.println(passWord.regex("X$%<>+#@y=z"));

	}
}
