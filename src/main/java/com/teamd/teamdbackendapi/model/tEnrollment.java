package com.teamd.teamdbackendapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class tEnrollment {
    // Define fields, including userID, courseID, and other properties

    @ManyToOne
    @JoinColumn(name = "courseID")
    private Course course;

    // Getters and setters
}
