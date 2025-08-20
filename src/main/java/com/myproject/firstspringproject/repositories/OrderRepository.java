package com.myproject.firstspringproject.repositories;

import com.myproject.firstspringproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
