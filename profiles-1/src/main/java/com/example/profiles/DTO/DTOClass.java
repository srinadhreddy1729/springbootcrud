package com.example.profiles.DTO;

import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class DTOClass {
	private Integer id;
	@NotBlank
	private String EmployeeName;
	@Max(2)
	private Long EmployeePhoneNumber;
	@Email
	private String EmployeeEmail;
	@Pattern(regexp ="[A-Z]{5}[0-9]{4}[a-z]{3}")
	private String EmployeePanCardNumber;
	@Max(1000000)
	private Long EmployeeSalary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public Long getEmployeePhoneNumber() {
		return EmployeePhoneNumber;
	}
	public void setEmployeePhoneNumber(Long employeePhoneNumber) {
		EmployeePhoneNumber = employeePhoneNumber;
	}
	public String getEmployeeEmail() {
		return EmployeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		EmployeeEmail = employeeEmail;
	}
	public String getEmployeePanCardNumber() {
		return EmployeePanCardNumber;
	}
	public void setEmployeePanCardNumber(String employeePanCardNumber) {
		EmployeePanCardNumber = employeePanCardNumber;
	}
	public Long getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(Long employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	
}
