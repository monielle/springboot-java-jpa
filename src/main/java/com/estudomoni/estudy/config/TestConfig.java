package com.estudomoni.estudy.config;

import com.estudomoni.estudy.entities.User;
import com.estudomoni.estudy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public void run(String... args) throws Exception{

        User u1 = new User(null, "Moni Gomes", "moni@gmail", "99999999", "123456");
        User u2 = new User(null, "Mika Gomes", "mika@gmail", "99999998", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
