package com.mani.gayi.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mani.gayi.hibernate.pojo.Employee;
import com.mani.gayi.hibernate.pojo.EmployeeDetail;
import com.mani.gayi.util.HibernateUtil;



public class Test {

	 public static void main(String args[]) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	             
	            transaction = session.beginTransaction();

	            Employee manager = new Employee("Puneet");
	            
	            EmployeeDetail employeeDetail = new EmployeeDetail();
	            
	            employeeDetail.setEmail("mani@mani.com");
	            employeeDetail.setPhone("7204413548");
	            employeeDetail.setUsername("mani");
	            employeeDetail.setPassword("mani");
	            
	            employeeDetail.setEmployee(manager);
	            
	            manager.setEmployeeDetail(employeeDetail);
	            Employee employee1 = new Employee("Sahil");
	            employee1.setManager(manager);
	            session.save(manager);
	            session.save(employee1);
	            transaction.commit();
	        }catch (HibernateException e) {
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	         
	    }
	
	
}
