package com.example.spring;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Composite implements Serializable{
	
	@Override
	public String toString() {
		return "Composite [name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Composite other = (Composite) obj;
		return name == other.name && salary == other.salary;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private int name;
	private int salary;

}
