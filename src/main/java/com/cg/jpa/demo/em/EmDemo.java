package com.cg.jpa.demo.em;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa.demo.model.Employee;

// methods from EntityManager class for CRUD Operations - 
// INSERT - persist();
// UPDATE - merge();
// DELETE - remove();
// SELECT - find();

public class EmDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Employee emp = new Employee(103, "Sonu", 50000);
		em.persist(emp); // INSERT

//		Employee emp2 = em.find(Employee.class, 102); // SELECT 
//		System.out.println(emp2.toString());

		em.getTransaction().commit();

		em.close();
		emf.close();

		System.out.println("End");

	}

}
