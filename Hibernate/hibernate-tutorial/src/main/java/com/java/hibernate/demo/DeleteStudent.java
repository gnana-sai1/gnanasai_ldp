package com.java.hibernate.demo;

import com.java.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session=factory.getCurrentSession();

        try{
            System.out.println("Deleting a student object");
            session.beginTransaction();
            int studentId = 1;
            Student myStudent = session.get(Student.class, studentId);
            session.delete(myStudent);

            session.createQuery("delete Student s where s.id = '2'").executeUpdate();

            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }
}
