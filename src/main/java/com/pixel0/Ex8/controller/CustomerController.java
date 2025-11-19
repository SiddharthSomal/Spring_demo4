package com.pixel0.Ex8.controller;

import com.pixel0.Ex8.Model.Customer;
import com.pixel0.Ex8.Service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service){
        this.service = service;
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return service.saveCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAll(){
        return service.getCustomers();
    }

}
