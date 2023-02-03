package com.estudomoni.estudy.config;

import com.estudomoni.estudy.entities.Order;
import com.estudomoni.estudy.entities.User;
import com.estudomoni.estudy.repositories.OrderRepository;
import com.estudomoni.estudy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;

    public void run(String... args) throws Exception{

        User u1 = new User(null, "Moni Gomes", "moni@gmail", "99999999", "123456");
        User u2 = new User(null, "Mika Gomes", "mika@gmail", "99999998", "123456");

        //data no formato UTC de acordo com a ISO 8601
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
