package com.cg.jpa.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// PostGRE
// CREATE TABLE emp_table 
// (eid INT constraint employee_pk PRIMARY KEY, 
// first_name varchar(40), salary DECIMAL);

// Oracle
// CREATE TABLE emp_table 
// (eid number(10) constraint emp_table_pk PRIMARY KEY, 
// first_name varchar(40), salary number(8,2));

@Entity
@Table(name = "emp_table")
public class Employee {

	// this is primary key column field
	@Id
	@Column(name = "eid")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "salary")
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String firstName, double salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}

	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
