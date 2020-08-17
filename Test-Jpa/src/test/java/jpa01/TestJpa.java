package jpa01;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;
import entity.livre;

public class TestJpa 
{
	private EntityManagerFactory factory = null;
	
	@Before
	public void init()
	{
		factory = Persistence.createEntityManagerFactory("pu_essai");
	}

	@Test
	public void findLivre() {
		
		EntityManager em = factory.createEntityManager();
		
		if(em != null)
		{
			livre livre1 = em.find(livre.class,1);
			System.out.println(livre1);
			
		}
		
		em.close();
		factory.close();
		
	}

	
	
	@Test
	public void listeLivres()
	{
		EntityManager em = factory.createEntityManager();
		
		if(em != null)
		{
			String query = "SELECT l FROM livre l";
			TypedQuery<livre> q = em.createQuery(query, livre.class);
			for(livre l : q.getResultList())
			{
				System.out.println(l);
			}
			
		}
		
		em.close();
		factory.close();
		
	}
	
	@Test
	public void listeLivresW()
	{
		EntityManager em = factory.createEntityManager();
		
		if(em != null)
		{
			String query = "SELECT l FROM livre l where l.id >=3";
			TypedQuery<livre> q = em.createQuery(query, livre.class);
			for(livre l : q.getResultList())
			{
				System.out.println(l);
			}
			
		}
		
		em.close();
		factory.close();
		
	}
	
	@Test
	public void insertLivre()
	{
		EntityManager em = factory.createEntityManager();
		livre l = new livre();
		l.setId(6);
		l.setAuteur("Victor Hugo");
		l.setTitre("Les Misérables");
		
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
	}
	
	@Test
	public void updateLivre()
	{
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		
		livre l = em.find(livre.class,5);
		l.setTitre("Du plaisir dans la cuisine");
		em.merge(l);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
	}
	
	@Test
	public void deleteLivre()
	{
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		
		livre l = em.find(livre.class,6);
		
		em.remove(l);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
	}
	
	

}
