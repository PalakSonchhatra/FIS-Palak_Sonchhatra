package com.example.CustomerService.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.CustomerService.model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction,Integer>{
	
	@Query("select t from Transaction t where t.transaction_type=?1")
	public List<Transaction> findByType(String transaction_type);
	
	

}
