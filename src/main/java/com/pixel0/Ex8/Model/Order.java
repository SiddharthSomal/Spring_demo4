package com.pixel0.Ex8.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String orderName;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(
            name = "customer_id",
            foreignKey = @ForeignKey(name = "fk_order_customer")
    )
    private Customer customer;

    public Order(){};

    public void getId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public String getOrderName(){
        return orderName;
    }
    public void setOrderName(String orderName){
        this.orderName = orderName;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}
