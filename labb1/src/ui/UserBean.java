package ui;

import java.util.Collection;

public class UserBean {
	private String userName;
	private String password;
	
	
	
	public UserBean() {
		this.userName = "Enter UserName!";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String doLogin(){
		return "";
	}
	
	public Collection getNames(){
		
		return null;
	}
	
	
}
