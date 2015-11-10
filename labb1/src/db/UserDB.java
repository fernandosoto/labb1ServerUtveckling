package db;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.*;
import org.hibernate.annotations.*;
import org.hibernate.cfg.Configuration;

import bo.User;

public class UserDB {
	
	public static Collection findByName(String name){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Labb1PU");
		EntityManager em = emf.createEntityManager();
		
		List result = em.createNamedQuery("User.findByName")
				.setParameter("name", name)
				.getResultList();
		em.close();
		emf.close();
		return result;
	}
	public static void createUser(User user)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Labb1PU");
		EntityManager em = emf.createEntityManager();
		em.persist(user);
		em.flush();
		em.close();
		emf.close();
	}
}
