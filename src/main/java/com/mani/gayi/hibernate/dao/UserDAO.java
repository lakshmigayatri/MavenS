package com.mani.gayi.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.mani.gayi.struts.beans.UserStrutsBean;
import com.mani.gayi.util.HibernateUtil;

public class UserDAO {

	public boolean validateUser(UserStrutsBean employee)
	{
		boolean userPresent = false;
		String uname = employee.getUsername();
		String pass = employee.getPassword();
		
		// Accessing the Database using HQL and Querying whether the username and password is present or not.
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "FROM EmployeeDetail E WHERE E.username = :username and E.password= :password";
		Query query = session.createQuery(hql);
		query.setParameter("username",uname);
		query.setParameter("password",pass);
		List results = query.list();
		if(results!=null){
			if(results.size()>0)
				userPresent=true;
			else
				userPresent=false;	
		}
		else
		{
			userPresent=false;	
		}
		
		session.close();
		return userPresent;
		
	}
	
	
	
}
