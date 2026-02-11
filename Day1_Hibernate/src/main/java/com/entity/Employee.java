package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String empname;
    @Column(unique=true)
    private String empemail;
    private double salary;
    @Column(name= "Post")
    private String designation;

    public Employee() {
        super();
    }

    public Employee(String empname, String empemail, double salary, String designation) {
        this.empname = empname;
        this.empemail = empemail;
        this.salary = salary;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }
 public void setId(int id) {
	 this.id=id;
 }
 
    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [id=" +id + ", empname=" + empname +
               ", empemail=" + empemail + ", salary=" + salary +
               ", designation=" + designation + "]";
    }


}
