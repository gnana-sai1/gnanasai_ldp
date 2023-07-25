package com.java.hibernate.demo;

import com.java.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UpdateStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session=factory.getCurrentSession();

        try{
            int studentId = 3;
            session.beginTransaction();
            Student myStudent = session.get(Student.class,studentId);
            myStudent.setFirstName("Gnana");
            System.out.println("Updating student");

            session.getTransaction().commit();

            session=factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("update Student s set s.email = 'abc@gmail.com'").executeUpdate();

            System.out.println("Updating students");

            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }
}
