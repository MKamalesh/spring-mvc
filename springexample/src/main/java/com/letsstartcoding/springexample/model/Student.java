package com.letsstartcoding.springexample.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
@NamedQuery(name="Student.findAll",query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Email @NotEmpty
	private String email;
	
	@NotEmpty
	private String country;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past @NotNull
	private Date dob;
	
	private boolean firstAttempt;
	
	@Size(min=3,max=30)
	private String firstName;
	
	@Size(min=3,max=30)
	private String lastName;
	
	private int id;
	
	@NotEmpty
	private String section;
	
	@NotEmpty
	private String sex;
	
	@NotEmpty
	private List<String> subjects=new ArrayList<String>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public boolean isFirstAttempt() {
		return firstAttempt;
	}

	public void setFirstAttempt(boolean firstAttempt) {
		this.firstAttempt = firstAttempt;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
