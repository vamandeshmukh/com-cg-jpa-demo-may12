package com.cg.jpa.demo.em;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa.demo.model.Employee;

public class EmDeleteDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Employee emp2 = em.find(Employee.class, 102); // SELECT
		System.out.println(emp2.toString());

		em.remove(emp2);

		em.getTransaction().commit();

		em.close();
		emf.close();

		System.out.println("End");

	}

}
