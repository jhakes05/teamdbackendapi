package com.teamd.teamdbackendapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.repository.tCourseRepository;

@RestController
@RequestMapping("/api")
public class YourController {

    @Autowired
    private tCourseRepository courseRepository;

    // Autowire other repositories if needed

    @GetMapping("/your-endpoint")
    public ResponseEntity<List<Object[]>> yourMethod() {
        List<Object[]> result = courseRepository.yourCustomQueryMethod();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
