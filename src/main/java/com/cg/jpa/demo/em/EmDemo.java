package com.cg.jpa.demo.em;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa.demo.model.Employee;

public class EmDemo {

	public static void main(String[] args) {

		System.out.println("Start...");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();

		Employee emp = new Employee(101, "Sonu", 50000);

		em.persist(emp);

		System.out.println("End");

	}

}
