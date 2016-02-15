package com.mani.gayi.hibernate.pojo;

public class EmployeeDetail {
	
	private String email;
	
	private String phone;
	
	private String username;
	
	private String password;

	private Employee employee;
	
	private Long employeeDetailId;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Long getEmployeeDetailId() {
		return employeeDetailId;
	}

	public void setEmployeeDetailId(Long employeeDetailId) {
		this.employeeDetailId = employeeDetailId;
	}

	

	
	

}
