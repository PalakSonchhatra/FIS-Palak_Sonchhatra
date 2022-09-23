package com.example.CustomerService.service;

import java.util.Optional;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.CustomerService.model.AccountDto;

@FeignClient(name="adminservice") //url="http://localhost:8086/admin")
public interface FeignProxy {
	
	@GetMapping("admin/balance/{acc_no}")
	public Optional<AccountDto> getBalance(@PathVariable("acc_no") int acc_no);
	
	
}
