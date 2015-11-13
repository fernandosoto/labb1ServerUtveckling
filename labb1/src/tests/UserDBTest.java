package tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import bo.User;
import db.UserDB;

public class UserDBTest {

	@Test
	public void testFindByEmail() {
		ArrayList<User> userList = (ArrayList<User>) UserDB.findByEmail("fest@kth.se");
		System.out.println(userList.toString());
	}
	
	
	public void testCreateUser(){
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date birthday = null;
		try {
			birthday = format.parse("1994/12/31");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User user = new User("fest@kth.se", "qwe", "Fernando", "Soto",birthday);
		UserDB.createUser(user);
	}

}
