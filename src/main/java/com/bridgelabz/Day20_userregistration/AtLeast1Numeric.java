package com.bridgelabz.Day20_userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AtLeast1Numeric {
	public boolean regex(String atLeastOneNumeric) {
		String regex = "^[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}";

		// Pattern object
		Pattern r = Pattern.compile(regex);
		// matcher object
		Matcher m = r.matcher(atLeastOneNumeric);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		AtLeast1Numeric atLeastOneNumeric = new AtLeast1Numeric();
		System.out.println(atLeastOneNumeric.regex("XYZmngccc@123abc"));
		System.out.println(atLeastOneNumeric.regex("X$%<>+#@8y=z"));

	}

}
