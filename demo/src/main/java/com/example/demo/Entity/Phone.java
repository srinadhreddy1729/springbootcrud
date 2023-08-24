package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	private Integer phonenumber;
	private String phonecompanyname;
	private Double phonecost;
	public Integer getid() {
		return id;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", phonenumber=" + phonenumber + ", phonecompanyname=" + phonecompanyname
				+ ", phonecost=" + phonecost + "]";
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPhonecompanyname() {
		return phonecompanyname;
	}
	public void setPhonecompanyname(String phonecompanyname) {
		this.phonecompanyname = phonecompanyname;
	}
	public Double getPhonecost() {
		return phonecost;
	}
	public void setPhonecost(Double phonecost) {
		this.phonecost = phonecost;
	}

}
