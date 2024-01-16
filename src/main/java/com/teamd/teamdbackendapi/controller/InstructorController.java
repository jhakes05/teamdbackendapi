package com.teamd.teamdbackendapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.model.Instructor;
import com.teamd.teamdbackendapi.repository.InstructorRepository;





@RestController
@CrossOrigin(origins = "http://localhost:5173/") // Replace with your React app URL
public class InstructorController {
@Autowired
private InstructorRepository instructorRepository;

@PostMapping("/PInstructor")
Instructor newInstructor(@RequestBody Instructor newInstructor){
return instructorRepository.save(newInstructor);
}

@GetMapping("/GInstructor")
List<Instructor>getAllInstructors(){
    return instructorRepository.findAll();
}
}
