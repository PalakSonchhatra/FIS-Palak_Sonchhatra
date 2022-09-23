package com.example.CustomerService.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.CustomerService.model.AccountDto;
import com.example.CustomerService.model.Transaction;
import com.example.CustomerService.repo.TransactionRepo;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	TransactionRepo repo;
	
	@Autowired
	FeignProxy proxy;

	@Override
	public List<Transaction> findTransactionType(String transaction_type) {
		// TODO Auto-generated method stub
		return repo.findByType(transaction_type);
	}

	@Override
	public Transaction addTransc(Transaction ts) {
		// TODO Auto-generated method stub
		return repo.save(ts);
	}

	@Override
	public Optional<AccountDto> getBalance(int acc_no) {
		
		return proxy.getBalance(acc_no);
	}

	@Override
	public List<Transaction> all() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	

}
