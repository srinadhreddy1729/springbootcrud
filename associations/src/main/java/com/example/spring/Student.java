//package com.example.spring;
//
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.SequenceGenerator;
//import jakarta.persistence.Table;
//
//@Entity
//public class Student {
//	@Id
//@GeneratedValue(strategy =GenerationType.AUTO)
//private Integer idl;
//private String studentname;
//private String branch;
//@OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
//@JoinColumn(name ="kiran_id",referencedColumnName ="idl")
//private List<College>college;
//public String getStudentname() {
//	return studentname;
//}
//public void setStudentname(String studentname) {
//	this.studentname = studentname;
//}
//public List<College> getCollege() {
//	return college;
//}
//public void setCollege(List<College> college) {
//	this.college =  college;
//}
//public Integer getId() {
//	return idl;
//}
//public void setId(Integer id) {
//	this.idl = id;
//}
//
//@Override
//public String toString() {
//	return "Student [id=" + idl + ", studentname=" + studentname + ", branch=" + branch + "]";
//}
//public String getBranch() {
//	return branch;
//}
//public void setBranch(String branch) {
//	this.branch = branch;
//}
//}
