package bo;

import java.util.Collection;

public class User {
	
	private String name;
	private String pass;
	
	
	
	public User(String userName, String password) {
		this.name = userName;
		this.pass = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String user) {
		this.name = user;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String pass) {
		this.pass = pass;
	}
	
	public static Collection findByName(String name){
		return UserDB.findByName(name);
	}

}
