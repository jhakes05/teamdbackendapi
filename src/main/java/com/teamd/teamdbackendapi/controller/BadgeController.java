package com.teamd.teamdbackendapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.model.Badge;
import com.teamd.teamdbackendapi.repository.BadgeRepository;


@RestController
public class BadgeController {
@Autowired
private BadgeRepository badgeRepository;

@PostMapping("/PBadge")
Badge newBadge(@RequestBody Badge newBadge){
    return badgeRepository.save(newBadge);
}

@GetMapping("/GBadge")
List<Badge>getAllBadge(){
    return badgeRepository.findAll(); 
}

}
