package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Student1 {
	
@Id
int studId;
String name;
String city;

@OneToOne
Laptop l;
public Student1() {

}
public Student1(int studId, String name, String city, Laptop l) {
	super();
	this.studId = studId;
	this.name = name;
	this.city = city;
	this.l = l;
}
public int getStudId() {
	return studId;
}
public void setStudId(int studId) {
	this.studId = studId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Laptop getL() {
	return l;
}
public void setL(Laptop l) {
	this.l = l;
}
@Override
public String toString() {
	return "Student [studId=" + studId + ", name=" + name + ", city=" + city + ", l=" + l + "]";
}

}
