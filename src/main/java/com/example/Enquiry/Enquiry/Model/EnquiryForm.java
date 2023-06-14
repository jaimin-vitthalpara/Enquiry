package com.example.Enquiry.Enquiry.Model;


import java.sql.Time;
import java.time.Month;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class EnquiryForm {


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name; 
	@Column
	private String email;

	@JsonFormat(pattern = "dd-mm-yyyy" , shape = Shape.STRING)
	@Column
	private Calendar DOB;
	@Column
	private String address;
	@Column
	private String collegename;
	@Column
	private String qualification;
	@Column
	private String passoutyear;
	@Column
	private int contactno;
	@Column
	private String currentjobtitle;
	@Column
	private int experience;
	@Column
	private String coursename;
	@Column
	private Month whenyouwanttostart;
	@Column
	private Time prefferbatchtime;
	@Column
	private Boolean lookingforplacement;
	@Column
	private Boolean goodinenglish;
	
	public EnquiryForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnquiryForm(int id, String name, String email, Calendar dOB, String address, String collegename,
			String qualification, String passoutyear, int contactno, String currentjobtitle, int experience,
			String coursename, Month whenyouwanttostart, Time prefferbatchtime, Boolean lookingforplacement,
			Boolean goodinenglish) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.DOB = dOB;
		this.address = address;
		this.collegename = collegename;
		this.qualification = qualification;
		this.passoutyear = passoutyear;
		this.contactno = contactno;
		this.currentjobtitle = currentjobtitle;
		this.experience = experience;
		this.coursename = coursename;
		this.whenyouwanttostart = whenyouwanttostart;
		this.prefferbatchtime = prefferbatchtime;
		this.lookingforplacement = lookingforplacement;
		this.goodinenglish = goodinenglish;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDOB() {
		return DOB;
	}

	public void setDOB(Calendar dOB) {
		this.DOB = dOB;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPassoutyear() {
		return passoutyear;
	}

	public void setPassoutyear(String passoutyear) {
		this.passoutyear = passoutyear;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public String getCurrentjobtitle() {
		return currentjobtitle;
	}

	public void setCurrentjobtitle(String currentjobtitle) {
		this.currentjobtitle = currentjobtitle;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Month getWhenyouwanttostart() {
		return whenyouwanttostart;
	}

	public void setWhenyouwanttostart(Month whenyouwanttostart) {
		this.whenyouwanttostart = whenyouwanttostart;
	}

	public Time getPrefferbatchtime() {
		return prefferbatchtime;
	}

	public void setPrefferbatchtime(Time prefferbatchtime) {
		this.prefferbatchtime = prefferbatchtime;
	}

	public Boolean isLookingforplacement() {
		return lookingforplacement;
	}

	public void setLookingforplacement(boolean lookingforplacement) {
		this.lookingforplacement = lookingforplacement;
	}

	public Boolean getGoodinenglish() {
		return goodinenglish;
	}

	public void setGoodinenglish(Boolean goodinenglish) {
		this.goodinenglish = goodinenglish;
	}
}
