package com.zensar.client;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.zensar.entity.Address;
//import com.zensar.entity.Departmentone;
import com.zensar.entity.Student;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;



public class Client 
{
public static void main(String[] args)
{
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	
	
	Student student =new Student(321,"ram",28);
	
	
	/*
	 * Student student = new Student(1,"vinu",23); Address ad1=new
	 * Address(10,"pune","vsp",7797908); Address ad2=new
	 * Address(11,"mp","tbii",55458); List<Address> address =new
	 * ArrayList<Address>();
	 * 
	 * address.add(ad1); address.add(ad2); student.setAddress(address);
	 */

		Transaction transaction = session.beginTransaction();
		//session.save(student);
		session.persist(student);
		//session.save(ad1);
		//session.save(ad2);
		
		
		transaction.commit();
		
		
		/*
		 * //session in persistance state student.setStudentAge(40);
		 * session.save(student);
		 */
		
		session.close();
		
		/*
		 * //in detach state student.setStudentAge(40); session.save(student);
		 */
		
		factory.close();
}
}

