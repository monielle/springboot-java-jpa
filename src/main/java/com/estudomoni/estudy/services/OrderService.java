package com.estudomoni.estudy.services;

import com.estudomoni.estudy.entities.Order;
import com.estudomoni.estudy.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
//autowired para o spring fazer a dependencia de forma transparente

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();

    }
}
