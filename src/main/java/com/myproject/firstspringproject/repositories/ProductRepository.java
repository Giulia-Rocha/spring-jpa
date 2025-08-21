package com.myproject.firstspringproject.repositories;

import com.myproject.firstspringproject.entities.Category;
import com.myproject.firstspringproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
