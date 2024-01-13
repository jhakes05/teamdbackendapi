package com.teamd.teamdbackendapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamd.teamdbackendapi.model.tInstructor;

public interface tInstructorRepository extends JpaRepository<tInstructor, Long> {
    // Define custom queries if needed
}

// Similarly, create repositories for Enrollment, Users, and Certification entities

