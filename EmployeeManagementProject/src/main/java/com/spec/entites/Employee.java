package com.spec.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "employee_table")
public class Employee {
	
	@Column(name="employeeName")
	private String empName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emid;
	
    @NotNull
	private double empSalary;
	
	@Pattern(regexp = "^[6789][0-9]{9}$",
	message = "please enter a mobile number 10 digit length starting from 6 to 9")
	private String mobileNum;
	@Email(message = "enter proper data")
	private String email;
	
	private String address;
	
	private String department;
	
	
	private int age;

	private char gender;
	
	private String designation;
	public Employee() {
		super();
	}
	public Employee(String empName, int emid, double empSalary, String mobileNum, String email, String address,
			String department, int age, char geneder, String designation, char gender) {
		super();
		this.empName = empName;
		this.emid = emid;
		this.empSalary = empSalary;
		this.mobileNum = mobileNum;
		this.email = email;
		this.address = address;
		this.department = department;
		this.age = age;
		this.gender = gender;
		this.designation = designation;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmid() {
		return emid;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGeneder(char geneder) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", emid=" + emid + ", empSalary=" + empSalary + ", mobileNum="
				+ mobileNum + ", email=" + email + ", address=" + address + ", department=" + department + ", age="
				+ age + ", gender=" + gender + ", designation=" + designation + "]";

	}
}