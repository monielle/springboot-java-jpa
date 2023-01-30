package com.estudomoni.estudy.services;

import com.estudomoni.estudy.entities.User;
import com.estudomoni.estudy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
//Preciso criar uma dependencia para userrepository para realizar as buscas
//autowired para o spring fazer a dependencia de forma transparente

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();

    }
}
