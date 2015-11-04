package db;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import org.hibernate.*;
import org.hibernate.annotations.*;
import org.hibernate.cfg.Configuration;

public class UserDB {
	
	public static Collection findByName(String name){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Labb1PU");
		EntityManager em = emf.createEntityManager();
		
		List result = em.createNamedQuery("User.findByName")
				.setParameter("name", name)
				.getResultList();
		
		
		
		return result;
	}
}
