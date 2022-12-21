package com.estudomoni.estudy.resources;


import com.estudomoni.estudy.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Essa classe é um recurso web que é implementado por um controlador Rest. Por isso essa anotation
@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"moni","mgsa@moni","999999","12345");
        return ResponseEntity.ok().body(u);
    }
}
