package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit-jpa");
		EntityManager em = emf.createEntityManager();
		Pessoa p = em.find(Pessoa.class, 2);
		/*
		 * para apagar uma pessoa do banco de dados em.remove(p);
		 */
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println(p);
		System.out.println("OK");
		em.close();
		emf.close();

	}
}