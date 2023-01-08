package com.estudomoni.estudy.repositories;

import com.estudomoni.estudy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
