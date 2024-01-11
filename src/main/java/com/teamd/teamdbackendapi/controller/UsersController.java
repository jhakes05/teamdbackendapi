package com.teamd.teamdbackendapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

a
import com.teamd.teamdbackendapi.model.Users;

@RestController

public class UsersController {

    @Autowired
    private UsersRepository userRepository;
    
    @PostMapping("/user") //orginal user
    Users newUser(@RequestBody Users newUser){
      return usersRepository.save(newUser);
    }
  


}
