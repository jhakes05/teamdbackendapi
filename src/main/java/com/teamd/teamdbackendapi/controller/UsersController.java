package com.teamd.teamdbackendapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.model.Users;
import com.teamd.teamdbackendapi.repository.UsersRepository;

@RestController
public class UsersController {
@Autowired
private UsersRepository usersRepository;

@PostMapping("/PUsers")
Users newUsers(@RequestBody Users newUsers){
  return usersRepository.save(newUsers);
}

@GetMapping("/GUsers")
List<Users>getAllUsers(){
  return usersRepository.findAll();
}
}
