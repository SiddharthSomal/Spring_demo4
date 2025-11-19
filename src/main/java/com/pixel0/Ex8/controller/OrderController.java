package com.pixel0.Ex8.controller;

import com.pixel0.Ex8.Model.Order;
import com.pixel0.Ex8.Service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    public OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getOrder(){
        return orderService.getOrders();
    }

    @PostMapping
    public Order saveOrder(@RequestBody Order o){
        return orderService.saveOrder(o);
    }
}
