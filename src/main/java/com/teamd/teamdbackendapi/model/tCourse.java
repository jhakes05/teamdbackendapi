package com.teamd.teamdbackendapi.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class tCourse {
    // Define fields, including CourseID, title, and other properties

    @OneToMany(mappedBy = "course")
    private List<tEnrollment> enrollments;

    @OneToMany(mappedBy = "course")
    private List<Certification> certifications;

    // Getters and setters
}
