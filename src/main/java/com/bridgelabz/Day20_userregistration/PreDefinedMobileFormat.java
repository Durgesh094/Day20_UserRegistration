package com.bridgelabz.Day20_userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedMobileFormat {
	public boolean regex(String mobileFormat) {

		String regex = "^[0-9]{2}+[ ][0-9]{10}$";

		//  Pattern object
		Pattern r = Pattern.compile(regex);
		//  matcher object
		Matcher m = r.matcher(mobileFormat);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Main Method
	public static void main(String[] args) {
		PreDefinedMobileFormat mobileFormat = new PreDefinedMobileFormat();
		System.out.println(mobileFormat.regex("91 7875531494"));
		System.out.println(mobileFormat.regex("915689412536589"));
		System.out.println(mobileFormat.regex("91 25896321"));

	}
}
