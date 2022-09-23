package com.example.AdminService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.AdminService.model.Account;
import com.example.AdminService.model.Customer;
import com.example.AdminService.repo.AccountRepo;
import com.example.AdminService.repo.CustomerRepo;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AccountRepo repo;
	
	@Autowired
	CustomerRepo repo1;
	
	@Override
	public List<Account> findallAccounts() {
		
		return repo.findAll();
	}

	@Override
	public Customer updateCustomer(Customer cust) {
		
		return repo1.save(cust);
	}

	@Override
	public String deleteCustomer(int acc_no) {
		// TODO Auto-generated method stub
		repo1.deleteById(acc_no);
		return "Customer is deleted..";
	}

	@Override
	public Account addAccount(Account acc) {
		
		return repo.save(acc);
	}

	@Override
	public Account updateAccount(Account acc) {
		
		return repo.save(acc);
	}

	@Override
	public String deleteAccount(int acc_no) {
		repo.deleteById(acc_no);
		return "Account is deleted... ";
	}

	@Override
	public Optional<Account> viewBalance(int acc_no) {
		
		return repo.findById(acc_no);
	}

	@Override
	public Customer addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return repo1.save(cust);
	}

	

}
