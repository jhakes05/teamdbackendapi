package com.teamd.teamdbackendapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.model.Support;
import com.teamd.teamdbackendapi.repository.SupportRepository;


@RestController
public class SupportController {
    @Autowired
    private SupportRepository supportRepository;

    @PostMapping("/PSupport")
Support newSupport(@RequestBody Support newSupport){
    return supportRepository.save(newSupport);
}
@GetMapping("/GSupport")
List<Support>getAllSupports(){
    return supportRepository.findAll();
}
}
