package ui;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bo.UserHandler;

@ManagedBean
@ViewScoped
public class RegisterUserBean {

	private String email;
	private String pass;
	private String firstName;
	private String lastName;
	private Date birthday;
	
	
	public String getEmail() {	
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String createUser(){
		UserHandler.createUser(email, pass, firstName, lastName, birthday);
		
		return "login?faces-redirect=true";
	}
	
	
}
