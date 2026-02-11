package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int Lid;
	String Lname;

	public Laptop() {
		
	}

	public Laptop(String lname) {
		super();
		Lname = lname;
	}

	public Laptop(int lid, String lname) {
		super();
		Lid = lid;
		Lname = lname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + "]";
	}
	

}
