package com.example.AdminService.service;

import java.util.List;
import java.util.Optional;
import com.example.AdminService.model.Account;
import com.example.AdminService.model.Customer;

public interface AdminService {
	
	public List<Account> findallAccounts();
	public Account addAccount(Account acc);
	public Customer addCustomer(Customer cust);
	public Customer updateCustomer(Customer cust);
	public Account updateAccount(Account acc);
	public String deleteCustomer(int cust_no);
	public String deleteAccount(int acc_no);
	public Optional<Account> viewBalance(int acc_no);
}
