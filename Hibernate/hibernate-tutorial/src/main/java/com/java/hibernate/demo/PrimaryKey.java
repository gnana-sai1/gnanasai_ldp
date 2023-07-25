package com.java.hibernate.demo;

import com.java.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKey {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session=factory.getCurrentSession();

        try{
            System.out.println("Creating students object");
            Student tempStudent1  = new Student("Chris","Francis","chris@gmail.com");
            Student tempStudent2  = new Student("Jack","Fin","jack@gmail.com");
            Student tempStudent3  = new Student("Milly","Field","milly@gmail.com");

            session.beginTransaction();
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);


            System.out.println("Saving students");

            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }
}
