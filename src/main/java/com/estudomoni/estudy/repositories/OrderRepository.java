package com.estudomoni.estudy.repositories;

import com.estudomoni.estudy.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
