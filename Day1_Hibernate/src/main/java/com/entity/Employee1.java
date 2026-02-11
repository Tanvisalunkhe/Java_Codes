package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee1 { // Many

	@Id
	int empId;
	String name;

	@ManyToOne
	Department d;

	public Employee1(int empId, String name, Department d) {
		super();
		this.empId = empId;
		this.name = name;
		this.d = d;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", d=" + d + "]";
	}

}
