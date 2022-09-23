package com.example.AdminService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.AdminService.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account,Integer>{

}
