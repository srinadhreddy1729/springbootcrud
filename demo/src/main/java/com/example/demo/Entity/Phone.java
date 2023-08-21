package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer Id;
	private Integer PhoneNumber;
	private String PhoneCompanyName;
	private Double PhoneCost;
	public Integer getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "Phone [Id=" + Id + ", PhoneNumber=" + PhoneNumber + ", PhoneCompanyName=" + PhoneCompanyName
				+ ", PhoneCost=" + PhoneCost + "]";
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getPhoneCompanyName() {
		return PhoneCompanyName;
	}
	public void setPhoneCompanyName(String phoneCompanyName) {
		PhoneCompanyName = phoneCompanyName;
	}
	public Double getPhoneCost() {
		return PhoneCost;
	}
	public void setPhoneCost(Double phoneCost) {
		PhoneCost = phoneCost;
	}

}
