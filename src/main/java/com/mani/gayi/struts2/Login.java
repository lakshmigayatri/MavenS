package com.mani.gayi.struts2;
import com.mani.gayi.hibernate.dao.UserDAO;
import com.mani.gayi.struts.beans.UserStrutsBean;
import com.opensymphony.xwork2.ActionSupport;
public class Login extends ActionSupport{	
	private static final long serialVersionUID = 1L;
	
	private UserStrutsBean userstrutsbean;

	
	
	public String execute()
	{		
		
		UserDAO userDAO= new UserDAO();
		boolean isUserPresent = userDAO.validateUser(userstrutsbean);
		if(isUserPresent)
		{
			return SUCCESS;
			
		}else 
			return ERROR;
	}



	public UserStrutsBean getUserstrutsbean() {
		return userstrutsbean;
	}



	public void setUserstrutsbean(UserStrutsBean userstrutsbean) {
		this.userstrutsbean = userstrutsbean;
	}
	
	
}
