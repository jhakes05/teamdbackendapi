package com.teamd.teamdbackendapi.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class tUsers {
    // Define fields, including userID, full_name, and other properties

    @OneToMany(mappedBy = "user")
    private List<Enrollment> enrollments;

    // Getters and setters
}

