package bo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class UserHandler {
	
	public static boolean login(String user, String pass){
		if(user.compareToIgnoreCase("root")==0 && pass.compareTo("qwe")==0){
			return true;
		}
		else
			return false;
	}
	public static void createUser(String email, String pass, String firstName,
			String lastName, Date birthday)
	{
		User u = new User(email,pass,firstName,lastName,birthday);
		User.createUser(u);
	}
	public static Collection getUserNamesByName(String email){
		ArrayList emails = new ArrayList();
		
		Collection users = User.findByEmail(email);
		
		for(Iterator it = users.iterator(); it.hasNext();){
			User user = (User) it.next();
			emails.add(new String(user.getEmail()));
		}
		return emails;
	}
}
