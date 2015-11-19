package db;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.*;
import org.hibernate.annotations.*;
import org.hibernate.cfg.Configuration;

import bo.User;

public class UserDB {
	
	public static Collection findByEmail(String email){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("community");
		EntityManager em = emf.createEntityManager();
		
		List result = em.createNamedQuery("User.findByEmail")
				.setParameter("email", email)
				.getResultList();
		em.close();
		emf.close();
		return result;
	}
	
	public static void createUser(User user)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("community");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(user);
		tx.commit();
		em.close();
		emf.close();
	}
}
