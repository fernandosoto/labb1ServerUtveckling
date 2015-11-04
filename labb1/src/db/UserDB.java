package db;

<<<<<<< HEAD
public class UserDB {

=======
import java.util.Collection;
import java.util.List;

import org.hibernate.*;
import org.hibernate.annotations.*;
import org.hibernate.cfg.Configuration;

public class UserDB {
	
	public static Collection findByName(String name){
		Session session = (new Configuration().configure().buildSessionFactory()
				.openSession());
		session.beginTransaction();
		
		List result;
		
		return result;
	}
>>>>>>> branch 'master' of https://github.com/fernandosoto/labb1ServerUtveckling
}
