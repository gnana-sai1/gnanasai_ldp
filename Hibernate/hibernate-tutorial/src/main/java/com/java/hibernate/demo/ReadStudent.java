package com.java.hibernate.demo;

import com.java.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ReadStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session=factory.getCurrentSession();

        try{
            System.out.println("Creating a student object");
            Student tempStudent  = new Student("Gnana","Talla","Gnana@gmail.com");
            session.beginTransaction();
            session.save(tempStudent);

            System.out.println("Saving student");

            session.getTransaction().commit();
            System.out.println("Done");

            System.out.println("Saved student. Generated Id: "+tempStudent.getId() );
            session = factory.getCurrentSession();

            session.beginTransaction();
            Student myStudent = session.get(Student.class,tempStudent.getId());
            System.out.println(myStudent.toString());

            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }
}
