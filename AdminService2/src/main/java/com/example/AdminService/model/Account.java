package com.example.AdminService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Account {

	@Id
	private int acc_no;
	
	@Column
	private int cust_no;
	
	@Column
	private int branch_id;
	
	@Column
	private int open_balance;

	@Column
	private String acc_type;
	
	@Column
	private String acc_status;

	public Account() {
		
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getCust_no() {
		return cust_no;
	}

	public void setCust_no(int cust_no) {
		this.cust_no = cust_no;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public int getOpen_balance() {
		return open_balance;
	}

	public void setOpen_balance(int open_balance) {
		this.open_balance = open_balance;
	}

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public String getAcc_status() {
		return acc_status;
	}

	public void setAcc_status(String acc_status) {
		this.acc_status = acc_status;
	}

	public Account(int acc_no, int cust_no, int branch_id, int open_balance, String acc_type,
			String acc_status) {
		super();
		this.acc_no = acc_no;
		this.cust_no = cust_no;
		this.branch_id = branch_id;
		this.open_balance = open_balance;
		this.acc_type = acc_type;
		this.acc_status = acc_status;
	}
	
}
