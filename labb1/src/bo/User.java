package bo;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.Type;

import db.UserDB;

@NamedQueries({
	@NamedQuery(name = "User.findByEmail", query = "SELECT u FROM "
			+ "User u WHERE u.email like :email")
})

@Entity
@Table(name="T_USER")
public class User {
	@Id
	@Column(name="T_USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="T_USER_EMAIL")
	private String email;
	@Column(name="T_USER_PASS")
	private String pass;
	
	@Column(name="T_USER_FIRSTNAME")
	private String firstName;
	@Column(name="T_USER_LASTNAME")
	private String lastName;
	@Column(name="T_USER_BIRTHDAY")
	@Type(type="date")
	private Date birthday;
	
	public User(){
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return email;
	}
	
	public User(String email, String pass, String firstName,
			String lastName, Date birthday) {
		this.email = email;
		this.pass = pass;
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	
	public String getPassword() {
		return pass;
	}
	public void setPassword(String pass) {
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public static Collection findByEmail(String email){
		return UserDB.findByEmail(email);
	}
	
	public static void createUser(User user){
		UserDB.createUser(user);
	}
}
