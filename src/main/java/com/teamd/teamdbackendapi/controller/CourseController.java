package com.teamd.teamdbackendapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.model.Course;
import com.teamd.teamdbackendapi.repository.CourseRepository;



@RestController
public class CourseController {
@Autowired
private CourseRepository courseRepository;

@PostMapping("/PCourse")
Course newCourse(@RequestBody Course newCourse){
    return courseRepository.save(newCourse);
}

@GetMapping("/GCourse")
List<Course>getAllCourses(){
    return courseRepository.findAll();
}
}
