package com.example.CustomerService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="transactions")
public class Transaction {
	
	@Id
	private int transactionno;
	
	@Column
	private int accountno;
	
	@Column
	private Date date_of_transaction;
	
	@Column
	private String mode_of_transaction;
	
	@Column
	private String transaction_type;
	
	@Column
	private int trans_amount;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public int getTransactionno() {
		return transactionno;
	}

	public void setTransactionno(int transactionno) {
		this.transactionno = transactionno;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public Date getDate_of_transaction() {
		return date_of_transaction;
	}

	public void setDate_of_transaction(Date date_of_transaction) {
		this.date_of_transaction = date_of_transaction;
	}

	public String getMode_of_transaction() {
		return mode_of_transaction;
	}

	public void setMode_of_transaction(String mode_of_transaction) {
		this.mode_of_transaction = mode_of_transaction;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public int getTrans_amount() {
		return trans_amount;
	}

	public void setTrans_amount(int trans_amount) {
		this.trans_amount = trans_amount;
	}

	public Transaction(int transactionno, int accountno, Date date_of_transaction, String mode_of_transaction,
			String transaction_type, int trans_amount) {
		super();
		this.transactionno = transactionno;
		this.accountno = accountno;
		this.date_of_transaction = date_of_transaction;
		this.mode_of_transaction = mode_of_transaction;
		this.transaction_type = transaction_type;
		this.trans_amount = trans_amount;
	}
	

}
