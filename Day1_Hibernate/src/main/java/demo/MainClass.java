package demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employeedata.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();

        Employeedata emp = new Employeedata();
        emp.setId(102);
        emp.setEmpname("anvi");
        emp.setEmpemail("anvi@gmail.com");
        emp.setSalary(45000);
        emp.setDesignation("HR");

     ss.persist(emp);
        //ss.save(emp);

        t.commit();
        ss.close();
        sf.close();

        System.out.println("Data Inserted....");
    }
}
