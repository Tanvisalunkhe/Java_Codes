package com.main;
import com.entity.Employee1;
import com.entity.Department;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee1.class);
		cfg.addAnnotatedClass(Department.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Department d = new Department();
		d.setDeptName("java Developer");

		Employee1 e1 = new Employee1();
		e1.setEmpId(1001);
		e1.setName("pranit");
		e1.setD(d);

		Employee1 e2 = new Employee1();
		e2.setEmpId(1002);
		e2.setName("Aniket");
		e2.setD(d);

		Employee1 e3 = new Employee1();
		e3.setEmpId(1003);
		e3.setName("yash");
		e3.setD(d);

		List<Employee1> list = new ArrayList<Employee1>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		d.setEmp(list);

		ss.persist(d);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);

		System.out.println("Data is Inserted ... !");

		tr.commit();
		ss.close();

	}

}
