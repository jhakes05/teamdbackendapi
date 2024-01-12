package com.teamd.teamdbackendapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamd.teamdbackendapi.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
