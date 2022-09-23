package com.example.CustomerService.service;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.CustomerService.model.AccountDto;
import com.example.CustomerService.model.Transaction;

public interface TransactionService {
	
	public List<Transaction>all();
	public List<Transaction> findTransactionType(String transaction_type);
	public Transaction addTransc(Transaction ts);
	
	public Optional<AccountDto> getBalance(@PathVariable("acc_no") int acc_no);
	

}
