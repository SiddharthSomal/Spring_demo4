package com.pixel0.Ex8.dao;

import com.pixel0.Ex8.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
