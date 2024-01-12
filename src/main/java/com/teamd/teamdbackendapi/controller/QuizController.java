package com.teamd.teamdbackendapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.model.Quiz;
import com.teamd.teamdbackendapi.repository.QuizRepository;



@RestController
public class QuizController {
    @Autowired
    private QuizRepository quizRepository;

    @PostMapping("/PQuiz")
    Quiz newqQuiz(@RequestBody Quiz newQuiz){
        return quizRepository.save(newQuiz);
    }

     @GetMapping("/GQuiz")
   List<Quiz>getAllQuiz(){
    return quizRepository.findAll();
   }
}
