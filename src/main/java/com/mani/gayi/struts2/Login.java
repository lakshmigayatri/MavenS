package com.mani.gayi.struts2;
import com.opensymphony.xwork2.ActionSupport;
public class Login extends ActionSupport{	
	private static final long serialVersionUID = 1L;
	
	private String uname,password;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute()
	{		
		System.out.println("Username "+uname);
		
		System.out.println("Password "+password);
		
		if(uname.equals("java4s") && password.equals("pass"))
		{
			return SUCCESS;
			
		}else 
			return ERROR;
	}
	
	
}
