package com.example.AdminService.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	private int cust_no;
	
	@Column
	private String firstname;
	
	@Column
	private String middlename;
	
	@Column
	private String lastname;
	
	@Column
	private String cust_city;
	
	@Column
	private String contactno;
	
	@Column
	private String occupation;
	
	@Column
	private Date dob;

	public int getCust_no() {
		return cust_no;
	}

	public void setCust_no(int cust_no) {
		this.cust_no = cust_no;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCust_city() {
		return cust_city;
	}

	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Customer() {
		
	}

	public Customer(int cust_no, String firstname, String middlename, String lastname, String cust_city,
			String contactno, String occupation, Date dob) {
		super();
		this.cust_no = cust_no;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.cust_city = cust_city;
		this.contactno = contactno;
		this.occupation = occupation;
		this.dob = dob;
	}
	
	

}
