package org.jonathan.user;

import org.jonathan.user.data.UserService;
import org.jonathan.user.data.mongodb.User;
import org.jonathan.user.data.mongodb.UserServiceMongoDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class UserApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(UserApplication.class, args);
        UserService userService = applicationContext.getBean(UserService.class);
        if (userService instanceof UserServiceMongoDB) {
            userService.save(new User("22Ada Lovelace", "22ada@ada-school.org"));
            List<User> all = userService.findAll();
            for (User user : all) {
                System.out.println(user);
            }
        } else {
            userService.save(new org.jonathan.user.data.postgresql.User("33Ada Lovelace", "33ada@ada-school.org"));
            List<org.jonathan.user.data.postgresql.User> all = userService.findAll();
            for (org.jonathan.user.data.postgresql.User user : all) {
                System.out.println(user);
            }
        }



    }

}
