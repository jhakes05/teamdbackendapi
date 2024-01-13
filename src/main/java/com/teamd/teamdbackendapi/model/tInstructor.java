package com.teamd.teamdbackendapi.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class tInstructor {
    // Define fields, including InstructorID, full_name, and other properties

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;

    // Getters and setters
}

