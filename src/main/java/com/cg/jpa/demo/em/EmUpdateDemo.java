package com.cg.jpa.demo.em;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa.demo.model.Employee;

public class EmUpdateDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Employee emp2 = em.find(Employee.class, 101); // SELECT
		System.out.println(emp2.toString());

		emp2.setSalary(60000);

		System.out.println(emp2.toString());
		em.merge(emp2);

		emp2 = em.find(Employee.class, 101); // SELECT
		System.out.println(emp2.toString());
		em.getTransaction().commit();

		em.close();
		emf.close();

		System.out.println("End");

	}

}
