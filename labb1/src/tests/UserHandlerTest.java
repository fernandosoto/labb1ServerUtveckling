package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import bo.UserHandler;

public class UserHandlerTest {

	@Test
	public void testLogin() {
		assertEquals(true, UserHandler.login("root", "qwe"));
	}

	@Test
	public void testGetUserNamesByName() {
		
	}

}
