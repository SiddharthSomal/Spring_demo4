package com.pixel0.Ex8.Service;

import com.pixel0.Ex8.Model.Order;
import com.pixel0.Ex8.dao.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    public OrderRepository repo;
    public OrderService(OrderRepository repo){
        this.repo = repo;
    }
    public Order saveOrder(Order o){
        return repo.save(o);
    }
    public List<Order> getOrders(){
        return repo.findAll();
    }
}
