package com.mani.gayi.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mani.gayi.hibernate.pojo.Employee;
import com.mani.gayi.util.HibernateUtil;



public class Test {

	 public static void main(String args[]) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	             
	            transaction = session.beginTransaction();
	             
	            Employee manager = new Employee("Puneet");
	             manager.setUsername("p");
	             manager.setPassword("p");
	            Employee employee1 = new Employee("Sahil");
	            employee1.setUsername("e1");
	            employee1.setPassword("e1");
	            Employee employee2 = new Employee("Geet");
	            employee2.setUsername("e2");
	            employee2.setPassword("e2");
	            employee1.setManager(manager);
	            employee2.setManager(manager);
	            session.save(manager);
	            session.save(employee1);
	            session.save(employee2);
	            transaction.commit();
	        }catch (HibernateException e) {
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	         
	    }
	
	
}
