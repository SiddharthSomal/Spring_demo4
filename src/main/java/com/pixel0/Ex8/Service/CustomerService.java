package com.pixel0.Ex8.Service;

import com.pixel0.Ex8.Model.Customer;
import com.pixel0.Ex8.dao.CustomerRespository;
import org.springframework.stereotype.Service;
import com.pixel0.Ex8.dao.CustomerRespository;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRespository repo;
    public CustomerService(CustomerRespository repo){
        this.repo = repo;
    }
    public Customer saveCustomer(Customer c){
        return repo.save(c);
    }
    public List<Customer> getCustomers(){
        return repo.findAll();
    }

}
