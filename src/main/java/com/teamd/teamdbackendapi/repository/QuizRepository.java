package com.teamd.teamdbackendapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamd.teamdbackendapi.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
