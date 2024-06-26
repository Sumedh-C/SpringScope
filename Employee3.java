package com.SpringBeanScope;

public class Employee3 
{
	private int EmployeeId;
	private String Name;
	private String EmployeeRoll;
	private int EmployeeSalary;
	
	
	public Employee3() {
		super();
	}
	public Employee3(int employeeId, String name, String employeeRoll, int employeeSalary) {
		super();
		EmployeeId = employeeId;
		Name = name;
		EmployeeRoll = employeeRoll;
		EmployeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee3 [EmployeeId=" + EmployeeId + ", Name=" + Name + ", EmployeeRoll=" + EmployeeRoll
				+ ", EmployeeSalary=" + EmployeeSalary + "]";
	}
	
}
