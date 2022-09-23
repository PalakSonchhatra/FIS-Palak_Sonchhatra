package com.example.CustomerService.model;

public class AccountDto {
	
	private int acc_no;
	
	private int cust_no;
	
	private int branch_id;
	
	private int open_balance;

	private String acc_type;
	
	private String acc_status;

	public AccountDto() {
		
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

	public AccountDto(int acc_no, int cust_no, int branch_id, int open_balance, String acc_type,
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
