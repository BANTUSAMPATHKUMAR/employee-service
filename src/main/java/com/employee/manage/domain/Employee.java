package com.employee.manage.domain;

public class Employee {
	private int employeeId;
	private String fistName;
	private String middleName;
	private String lastName;
	private int age;

	public Employee() {
	}

	public Employee(int employeeId, String fistName, String middleName, String lastName, int age) {
		super();
		this.employeeId = employeeId;
		this.fistName = fistName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", fistName=" + fistName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", age=" + age + "]";
	}

}
