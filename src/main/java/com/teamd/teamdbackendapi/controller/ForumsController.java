package com.teamd.teamdbackendapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.model.Forums;
import com.teamd.teamdbackendapi.repository.ForumsRepository;



@RestController
public class ForumsController {
    @Autowired
    private ForumsRepository forumsRepository;

    @PostMapping("/PForums")
    Forums newForums(@RequestBody Forums newForums)
    {
        return forumsRepository.save(newForums);
    }
   
    @GetMapping("/GForums")
    List<Forums>getAllForums(){
        return forumsRepository.findAll();
    }
}
