package com.example.CustomerService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerService.model.AccountDto;
import com.example.CustomerService.model.Transaction;
import com.example.CustomerService.service.TransactionService;

@RestController
@RequestMapping("/ts")
public class TransactionController {

	@Autowired
	TransactionService service;
	
	@GetMapping("/all")
	public List<Transaction> all() {
		return service.all();
	}
	
	@PostMapping("/add")
	public Transaction addTransaction(@RequestBody Transaction ts) {
		return service.addTransc(ts);
	}
	
	@GetMapping("/type/{transaction_type}")
	public List<Transaction> getbyType(@PathVariable("transaction_type") String  transaction_type){
		return service.findTransactionType(transaction_type);
	}
	
	@GetMapping("/balance/{acc_no}")
	public Optional<AccountDto> getBalance(@PathVariable("acc_no")int acc_no) {
		return service.getBalance(acc_no);
	}
}
