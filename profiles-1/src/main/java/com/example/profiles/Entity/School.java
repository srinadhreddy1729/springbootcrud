package com.example.profiles.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Schools" )
public class School {
	@Id
	private Integer id;
	private String EmployeeName;
	private Long EmployeePhoneNumber;
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
	private String EmployeeEmail;
	private String EmployeePanCardNumber;
	private Long EmployeeSalary;

}
