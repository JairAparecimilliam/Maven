package application;

import javax.persistence.Persistence;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Carlos da silva", "Carlos@gmail.com");
		Pessoa p2 = new Pessoa(2, "Moizes Tiago", "Moizes@gmail.com");
		Pessoa p3 = new Pessoa(3, "Antônio Fagundes", "Antonio@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit-jpa");
		EntityManager em = emf.createEntityManager();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
