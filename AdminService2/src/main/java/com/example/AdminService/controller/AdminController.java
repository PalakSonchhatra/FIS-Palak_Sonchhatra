package com.example.AdminService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.AdminService.model.Account;
import com.example.AdminService.model.Customer;
import com.example.AdminService.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	
	@GetMapping("/all")
	public List<Account> getAll() {
		return service.findallAccounts();
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer cust) {
		return service.updateCustomer(cust);
	}
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer cust) {
		return service.addCustomer(cust);
	}
	
	@DeleteMapping("/deleteCustomer/{acc_no}")
	public String deleteCustomer(@PathVariable ("acc_no") int acc_no) {
		return service.deleteCustomer(acc_no);
	}
	
	@PostMapping("/addAccount")
	public Account addAccount(@RequestBody Account acc) {
		return service.addAccount(acc);
	}
	
	@PutMapping("/updateAccount")
	public Account updateAccount(@RequestBody Account acc) {
		return service.updateAccount(acc);
	}
	
	@DeleteMapping("/deleteAcc/{acc_no}")
	public String deleteAccount(@PathVariable("acc_no") int acc_no) {
		return service.deleteAccount(acc_no);
	}
	
	@GetMapping("/balance/{acc_no}")
	public Optional<Account> getBalance(@PathVariable("acc_no") int acc_no) {
		return service.viewBalance(acc_no);
	}
}
