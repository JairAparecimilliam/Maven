package application;

import javax.persistence.Persistence;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos da silva", "Carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Moizes Tiago", "Moizes@gmail.com");
		Pessoa p3 = new Pessoa(null, "Antônio Fagundes", "Antonio@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("OK");
	}

}
