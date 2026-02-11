package com.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.StudentEntity;

public class MainClassMany {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(StudentEntity.class);
        cfg.addAnnotatedClass(Course.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Course c1 = new Course();
        c1.setCourseId(110);
        c1.setCourseName("python");
        Course c2 = new Course();
        c2.setCourseId(111);
        c2.setCourseName("Java");
        
       

        Set<Course> courseSet = new HashSet<>();
        courseSet.add(c1);
        courseSet.add(c2);

        StudentEntity s1 = new StudentEntity(101, "Tanvi", courseSet);
        StudentEntity s2 = new StudentEntity(102, "Amit", courseSet);

        session.persist(c1);
        session.persist(c2);
        session.persist(s1);
        session.persist(s2);

        tx.commit();
        session.close();
        sf.close();
    }
}
