package jpa01;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;
import entity.livre;

public class TestJpa 
{
	private EntityManagerFactory factory = null;

	@Test
	public void test() {
		factory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = factory.createEntityManager();
		
		if(em != null)
		{
			livre livre1 = em.find(livre.class,1);
			System.out.println(livre1);
			
		}
		
	}

}
