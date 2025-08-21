package com.myproject.firstspringproject.repositories;

import com.myproject.firstspringproject.entities.OrderItem;
import com.myproject.firstspringproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
