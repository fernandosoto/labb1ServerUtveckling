package ui;

import java.util.Collection;
import javax.faces.bean.*;

import bo.User;
import bo.UserHandler;

@ManagedBean
@SessionScoped
public class UserBean {
	private String userName;
	private String password;
	
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
		if(UserHandler.login(userName,password))
		{
			return "homePage?faces-redirect=true";
		}
		else
		{
			return "failure";	
		}
	}
	public String createUser(){
		
		
		return "fail";
	}
	
	public Collection getEmail(String email){
		return User.findByEmail(email);
	}
	
	
}
