package com.cg.jpa.demo.sf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cg.jpa.demo.model.Employee;

public class SfDemo {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();

		Employee emp = new Employee(104, "Monu", 85000);

		session.save(emp);
//		session.delete(emp);
//		session.merge(emp);
		
		Employee emp2 = session.find(Employee.class, 104);
		System.out.println(emp2.toString());

		session.close();
		factory.close();

	}

}
