package com.trv13.ProjectWithMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.trv13.ProjectWithMaven.Address.Address;
import com.trv13.ProjectWithMaven.Student.Student;

public class App {
	public static void main(String[] args) throws IOException, SerialException, SQLException {
		System.out.println("Project Started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); // Mentioning the configuration file is OPTIONAL
//        if the name is different or located in some other folder then it is required to mentioned
		SessionFactory factory = cfg.buildSessionFactory(); // SessionFactory is a factory to use the credential of the
															// xml used.

		// creating Student Object
		Student st = new Student();
		st.setId(1);
		st.setName("SuryaN");
		st.setSubject("Java Hibernate<3");
		st.setX(13);
		st.setDate(new Date());

		// creaeting Address Object
//		Address address = new Address();
//		address.setIsOpen(true);
//		address.setAddressId(1);
//		address.setCity("Kanpur");
//		address.setLocation("Flying Beasts");
//		address.setDate(new Date());
//		// Inserting Image
//		FileInputStream fis = new FileInputStream("src/main/java/picture/robot.jpg");
//		byte[] b = new byte[fis.available()];
//		fis.read(b);
//		address.setImage(new SerialBlob(b));
//		fis.close();

		Session session = factory.openSession(); // Open seesion using the session factory
		Transaction transaction = session.beginTransaction(); // Just to start making transaction
		
		session.save(st);
//		session.save(address);
		
		transaction.commit();

		session.close();
		factory.close();
		System.out.println(factory.isClosed()); // to check if the session is closed or not
	}
}
