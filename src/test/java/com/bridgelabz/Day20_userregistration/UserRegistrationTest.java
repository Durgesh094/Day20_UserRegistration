package com.bridgelabz.Day20_userregistration;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.bridgelabz.Day20_userregistration.UserRegistration.User;
import com.bridgelabz.Day20_userregistration.UserRegistration.User.UserRegistrationImpl;

public class UserRegistrationTest {
	boolean result;
	UserRegistrationImpl validation = new UserRegistrationImpl();
	User user1 = new User("Durgesh", "Chavan", "dbc123@gmail.com", "7875334891", "dbc123");
	User user2 = new User("abhi", "chavan", "abhi7875", "7875334891", "abhi123");
	@Test
	public void firstNameValidationHappy() {
		result = validation.firstNameValidation(user1);
		assertEquals(true, result);
	}
	@Test
	public void firstNameValidationSad() {
		result = validation.firstNameValidation(user2);
		assertEquals(true, result);
	}
	@Test
	public void lastNameValidationHappy() {
		result = validation.lastNameValidation(user1);
		assertEquals(true, result);
	}
	@Test
	public void lastNameValidationSad() {
		result = validation.lastNameValidation(user2);
		assertEquals(true, result);
	}
	@Test
	public void eMailValidationHappy() {
		result = validation.eMailValidation(user1);
		assertEquals(true, result);
	}
	@Test
	public void eMailValidationSad() {
		result = validation.eMailValidation(user2);
		assertEquals(true, result);
	}
	@Test
	public void phoneNumValidationHappy() {
		result = validation.phoneNumValidation(user1);
		assertEquals(true, result);
	}
	@Test
	public void phoneNumValidationSad() {
		result = validation.phoneNumValidation(user2);
		assertEquals(true, result);
	}
	@Test
	public void passWordValidationHappy() {
		result = validation.passwordValidation(user1);
		assertEquals(true, result);
	}
	@Test
	public void passWordValidationSad() {
		result = validation.passwordValidation(user2);
		assertEquals(true, result);
	}
}
