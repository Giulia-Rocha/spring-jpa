package com.myproject.firstspringproject.repositories;

import com.myproject.firstspringproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
