package com.example.profiles.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentDetails {
	@Id
	private Integer id;
	private String  studentname;
	private String studentcollegename;
	private String studentfathername;
	private String studentemailid;
	private Long studentmobilenumber;
	private String studentpancard;
	private Long studentidnumber;
	private Integer studentmarks;
	private Long studentaadharnumber;
	private String studentcollegeaddres;

	public String getStudentcollegeaddres() {
		return studentcollegeaddres;
	}
	public void setStudentcollegeaddres(String studentcollegeaddres) {
		this.studentcollegeaddres = studentcollegeaddres;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentcollegename() {
		return studentcollegename;
	}
	public void setStudentcollegename(String studentcollegename) {
		this.studentcollegename = studentcollegename;
	}
	public String getStudentfathername() {
		return studentfathername;
	}
	public void setStudentfathername(String studentfathername) {
		this.studentfathername = studentfathername;
	}
	public String getStudentemailid() {
		return studentemailid;
	}
	public void setStudentemailid(String studentemailid) {
		this.studentemailid = studentemailid;
	}
	public Long getStudentmobilenumber() {
		return studentmobilenumber;
	}
	public void setStudentmobilenumber(Long studentmobilenumber) {
		this.studentmobilenumber = studentmobilenumber;
	}
	public String getStudentpancard() {
		return studentpancard;
	}
	public void setStudentpancard(String studentpancard) {
		this.studentpancard = studentpancard;
	}
	public Long getStudentidnumber() {
		return studentidnumber;
	}
	public void setStudentidnumber(Long studentidnumber) {
		this.studentidnumber = studentidnumber;
	}
	public Integer getStudentmarks() {
		return studentmarks;
	}
	public void setStudentmarks(Integer studentmarks) {
		this.studentmarks = studentmarks;
	}
	public Long getStudentaadharnumber() {
		return studentaadharnumber;
	}
	public void setStudentaadharnumber(Long studentaadharnumber) {
		this.studentaadharnumber = studentaadharnumber;
	}
	
	

}
