package demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Employeedata {

    @Id
   
    private int id;

    private String empname;
    private String empemail;
    private double salary;
    private String designation;

    public Employeedata() {
        super();
    }

    public Employeedata(String empname, String empemail, double salary, String designation) {
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
