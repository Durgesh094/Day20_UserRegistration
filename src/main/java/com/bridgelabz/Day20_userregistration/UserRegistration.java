package com.bridgelabz.Day20_userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public interface IUser {

		public boolean firstNameValidation(User user);

		public boolean lastNameValidation(User user);

		public boolean eMailValidation(User user);

		public boolean phoneNumValidation(User user);

		public boolean passwordValidation(User user);
	}

	public class User {
		private String firstName;
		private String lastName;
		private String eMail;
		private String phoneNumber;
		private String passWord;

		public User(String firstName, String lastName, String eMail, String phoneNumber, String passWord) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.eMail = eMail;
			this.phoneNumber = phoneNumber;
			this.passWord = passWord;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String geteMail() {
			return eMail;
		}

		public void seteMail(String eMail) {
			this.eMail = eMail;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPassWord() {
			return passWord;
		}

		public void setPassword(String password) {
			this.passWord = password;
		}

		public class UserRegistrationImpl implements IUser {
			boolean patternMatch;

			@Override
			public boolean firstNameValidation(User user) {
				patternMatch = Pattern.matches(" ", user.getFirstName());
				return patternMatch;
			}

			@Override
			public boolean lastNameValidation(User user) {
				patternMatch = Pattern.matches(" ", user.getLastName());
				return patternMatch;

			}

			@Override
			public boolean eMailValidation(User user) {
				patternMatch = Pattern.matches(" ", user.geteMail());
				return patternMatch;
			}

			@Override
			public boolean phoneNumValidation(User user) {
				patternMatch = Pattern.matches(" ", user.getPhoneNumber());
				return patternMatch;
			}

			@Override
			public boolean passwordValidation(User user) {
				patternMatch = Pattern.matches(" ", user.getPassWord());
				return patternMatch;
			}

			public void main(String[] args) {
				UserRegistrationImpl validation = new UserRegistrationImpl();
				Scanner scanner = new Scanner(System.in);
				System.out.print("First Name : ");
				firstName = scanner.next();
				System.out.print("Last Name : ");
				lastName = scanner.next();
				System.out.print("Email Id : ");
				eMail = scanner.next();
				System.out.print("Phone Number : ");
				phoneNumber = scanner.next();
				User user = new User(firstName, lastName, eMail, phoneNumber, passWord);
				validation.firstNameValidation(user);
				validation.lastNameValidation(user);
				validation.eMailValidation(user);
				validation.phoneNumValidation(user);
				validation.passwordValidation(user);
			}
		}
	}
}