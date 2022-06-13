package com.cg.jpa.demo.sf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cg.jpa.demo.model.Employee;

// Hibernate methods 
//save();
//merge();
//delete();
//find();

public class SfDemo {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		session.beginTransaction();

		Employee emp = new Employee(105, "Ponu", 858585);

		session.save(emp); // INSERT
//		session.delete(emp);
//		session.merge(emp);

		Employee emp2 = session.find(Employee.class, 105); // SELECT 
		System.out.println(emp2.toString());

		session.getTransaction().commit();

		session.close();
		factory.close();

	}

}
