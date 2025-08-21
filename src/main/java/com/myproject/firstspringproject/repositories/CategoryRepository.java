package com.myproject.firstspringproject.repositories;

import com.myproject.firstspringproject.entities.Category;
import com.myproject.firstspringproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
