package com.example.AdminService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.AdminService.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
