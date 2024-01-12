package com.teamd.teamdbackendapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamd.teamdbackendapi.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Long>{

}
