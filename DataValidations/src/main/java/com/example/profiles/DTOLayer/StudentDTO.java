package com.example.profiles.DTOLayer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Matcher;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class StudentDTO {
	
	private Integer id;
	@NotEmpty    
	private String  studentname;
	@NotBlank  
	private String studentcollegename;
	@NotNull 
	private String studentfathername;
	@Email 
	private String studentemailid;
	@Max(5)
	private Long studentmobilenumber;
	@Pattern(regexp="[A-Z]{5}[0-9]{4}[a-z]{2}")
	private String studentpancard;
	private Long studentidnumber;
	@Min(2)
	private Integer studentmarks;
	//@Future  @Past
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate studentjoindate;
	private Long studentaadharnumber;
	//@Pattern(regexp ="[A-Za-z]{3,}")
	//@Pattern(regexp="^[a-zA-Z0-9]*$")
	//@Pattern(regexp="^\\w+$")
	//@Pattern(regexp="[0-9]{6}")
	//@Pattern(regexp="^\\w+\\s+\\w+$")
	//@Pattern(regexp="^[\\w\\s]+$")
	//@Pattern(regexp="[4-9][0-9]{9}")
     
	//@AssertTrue(message="it should be true")
	//@AssertFalse(message="it should be false")
	private Boolean studentcollegeaddres;

	public LocalDate getStudentjoindate() {
		return studentjoindate;
	}
	public void setStudentjoindate(LocalDate studentjoindate) {
		this.studentjoindate = studentjoindate;
	}
	public Boolean getStudentcollegeaddres() {
		return studentcollegeaddres;
	}
	public void setStudentcollegeaddres(Boolean studentcollegeaddres) {
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
