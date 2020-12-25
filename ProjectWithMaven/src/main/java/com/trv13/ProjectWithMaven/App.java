package com.trv13.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.trv13.ProjectWithMaven.Student.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started..." );
        Configuration cfg = new Configuration(); 
        cfg.configure("hibernate.cfg.xml"); // Mentioning the configuration file is OPTIONAL 
//        if the name is different or located in some other folder then it is required to mentioned
        SessionFactory factory = cfg.buildSessionFactory(); // SessionFactory is a factory to use the credential of the xml used.
        
        Student st = new Student();
        st.setName("Surya");
        st.setSubject("Java<3");
        
        Session session = factory.openSession(); // Open seesion using the session factory
        Transaction transaction = session.beginTransaction(); // Just to start making transaction
        session.save(st);
        transaction.commit();
        
        session.close();
        factory.close();
        System.out.println(factory.isClosed()); // to check if the session is closed or not
    }
}
