package com.Customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Customer.Entity.CustomerEntity;



public interface CustomerRepository extends JpaRepository <CustomerEntity,Integer> {

}
