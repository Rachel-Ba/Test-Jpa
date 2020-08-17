package jpa01;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.Test;
import entity.livre;

public class TestJpa 
{
	private EntityManagerFactory factory = null;

	@Test
	public void findLivre() {
		//factory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = factory.createEntityManager();
		
		if(em != null)
		{
			livre livre1 = em.find(livre.class,1);
			System.out.println(livre1);
			
		}
		
		em.close();
		factory.close();
		
	}
	
	public void listeLivres()
	{
		EntityManager em = factory.createEntityManager();
		
		if(em != null)
		{
			String query = "SELECT 1 FROM Livre 1";
			TypedQuery<livre> q = em.createQuery(query, livre.class);
			for(livre l : q.getResultList())
			{
				System.out.println(l);
			}
			
		}
		
		em.close();
		factory.close();
		
	}

}
