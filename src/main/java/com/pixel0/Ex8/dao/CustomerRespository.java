package com.pixel0.Ex8.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pixel0.Ex8.Model.Customer;
@Repository
public interface CustomerRespository extends JpaRepository<Customer,Long> {

}


