package com.teamd.teamdbackendapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.model.Enrollment;
import com.teamd.teamdbackendapi.repository.EnrollmentRepository;



@RestController
@CrossOrigin(origins = "http://localhost:5173/") // Replace with your React app URL
public class EnrollmentController {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @PostMapping("/PEnrollment")
    Enrollment newEnrollment(@RequestBody Enrollment newEnrollment){
        return enrollmentRepository.save(newEnrollment);
    }

    @GetMapping("/GEnrollment")
   List<Enrollment>getAllEnrollments(){
    return enrollmentRepository.findAll();
   }
    
}
