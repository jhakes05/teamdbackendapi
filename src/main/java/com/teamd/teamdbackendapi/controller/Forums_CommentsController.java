package com.teamd.teamdbackendapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.model.Forums_Comments;
import com.teamd.teamdbackendapi.repository.Forums_CommentsRepository;




@RestController
public class Forums_CommentsController {
    @Autowired
    private Forums_CommentsRepository forums_CommentsRepository;
    
    @PostMapping("/PForums_Comments")
    Forums_Comments newForums_Comments(@RequestBody Forums_Comments newForums_Comments){
        return forums_CommentsRepository.save(newForums_Comments);
    }

    @GetMapping("/GForums_Comments")
    List<Forums_Comments>getAllForums_Comments(){
        return forums_CommentsRepository.findAll();
    }

}
