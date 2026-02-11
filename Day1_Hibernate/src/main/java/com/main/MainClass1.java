package com.main;
import com.entity.Laptop;

import com.entity.Student1;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass1 { 
	public static void main(String[] args) {
		
	
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Student1.class);
	cfg.addAnnotatedClass(Laptop.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	
	Laptop l=new Laptop();
	l.setLname("Hp");
	
	ss.persist(l);
	
	Student1 s=new Student1();
	s.setStudId(101);
	s.setName("Tanvi");
	s.setCity("Satara");
	s.setL(l);
	ss.persist(s);
	System.out.println("Data Is Inserted!...");
	tr.commit();
	ss.close();
	
	


}
}
