package com.app;

public class Employee {
	private Integer empId;
	private String empName;
	private Integer age;
	private String designation;
	private Address address;
	
	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, Integer age, String designation, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.designation = designation;
		this.address = address;
	}
	
	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Integer getAge() {
		return age;
	}

	public String getDesignation() {
		return designation;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", designation=" + designation
				+ ", address=" + address + "]";
	}
	
}
