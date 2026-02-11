package com.deo;
import com.entity.Employee;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class EmployeeDao {
public void create() {
	Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    cfg.addAnnotatedClass(Employee.class);

    SessionFactory sf = cfg.buildSessionFactory();
    Session ss = sf.openSession();
    Transaction t = ss.beginTransaction();

    Employee emp = new Employee();
    //emp.setId(104);
    emp.setEmpname("Tanvi");
    emp.setEmpemail("Tanvi@gmail.com");
    emp.setSalary(155000);
    emp.setDesignation("Java Devloper");

 ss.persist(emp);
    //ss.save(emp);

    t.commit();
    ss.close();
    sf.close();

    System.out.println("Data Inserted....");
}
public void update() {


		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;
		Employee e = ss.load(Employee.class, id);
	
	    e.setEmpname("Janvi");
	    e.setEmpemail("Janvi@gmail.com");
	    e.setSalary(85000);
	    e.setDesignation("Manger");
	

//		ss.update(e);
		ss.merge(e);
		tr.commit();
		ss.close();
sf.close();
		System.out.println("Data is updated..");

	}
public void deleteData() {

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	int id = 102;
	Employee e = ss.get(Employee.class, id);

//	ss.delete(e);
	ss.remove(e);


	tr.commit();
	ss.close();
sf.close();
	System.out.println("Data is Deleted... ! ");

}
public void getAllData() {

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	// sql query for fetch all data - select * from empdata;

	// hql Query -> from Employee

	String hqlQuery = "from Employee";

	Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
	List<Employee> list = query.list();

	for (Employee employee : list) {
		System.out.println(employee);
	}

	tr.commit();
	ss.close();

}

public void getSingleRecord() {

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	String hqlQuery = "from Employee where id =: id";

	Query<Employee> query = ss.createQuery(hqlQuery);
	query.setParameter("id", 2);
	//query.executeUpdate();

	Employee e = query.uniqueResult();
	System.out.println(e);

	tr.commit();
	ss.close();

}
public void deleteSingleRecord() {

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	String hqlQuery = "delete from Employee where id =: id";

	Query<Employee> query = ss.createQuery(hqlQuery);
	query.setParameter("id", 1);
	query.executeUpdate();

	//Employee e = query.uniqueResult();
	System.out.println("Data is Deleted");

	tr.commit();
	ss.close();

}


}