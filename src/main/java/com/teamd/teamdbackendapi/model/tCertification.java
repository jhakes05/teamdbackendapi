package com.teamd.teamdbackendapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class tCertification {
    // Define fields, including userID, instructorID, courseID, dateIssued, and other properties

    @ManyToOne
    @JoinColumn(name = "courseID")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "instructorID")
    private Instructor instructor;

    @ManyToOne
    @JoinColumn(name = "userID")
    private Users user;

    // Getters and setters
}

