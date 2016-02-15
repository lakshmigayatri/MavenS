package com.mani.gayi.hibernate.pojo;

import java.util.Set;

public class Employee {
    private int employeeId;
    private String name;
    private Integer managerId;
    private Set employees;
    private Employee manager;
    
	public Set getEmployees() {
        return employees;
    }
    public void setEmployees(Set employees) {
        this.employees = employees;
    }
    public Employee getManager() {
        return manager;
    }
    public void setManager(Employee manager) {
        this.manager = manager;
    }
    public Employee() {
    }
    public Employee(String name) {
        this.name = name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getManagerId() {
        return managerId;
    }
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}