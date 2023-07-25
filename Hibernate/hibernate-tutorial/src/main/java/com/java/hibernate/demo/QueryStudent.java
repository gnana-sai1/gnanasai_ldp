package com.java.hibernate.demo;

import com.java.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class QueryStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session=factory.getCurrentSession();

        try{
            session.beginTransaction();
            List<Student> theStudents = session.createQuery("from Student").getResultList();

            display(theStudents);
            System.out.println("\n");

            theStudents = session.createQuery("from Student s where s.lastName='Field'").getResultList();
            display(theStudents);
            System.out.println("\n");

            theStudents = session.createQuery("from Student s" +
                    " where s.lastName = 'Wood' OR s.firstName='Chris'").getResultList();
            display(theStudents);
            System.out.println("\n");

            theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
            display(theStudents);

            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }

    private static void display(List<Student> theStudents) {
        for( Student student : theStudents){
            System.out.println(student);
        }
    }
}
