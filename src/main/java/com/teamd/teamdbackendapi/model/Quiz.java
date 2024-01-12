package com.teamd.teamdbackendapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Quiz {
    @Id
    @GeneratedValue

    private long QuizID;
    private long CourseID;
    private long UserID;
    private String title;
    private String description;
    private String file;
    private String StartDate;
    private String EndDate;
    private String score;


    public long getQuizID() {
        return this.QuizID;
    }

    public void setQuizID(long QuizID) {
        this.QuizID = QuizID;
    }

    public long getCourseID() {
        return this.CourseID;
    }

    public void setCourseID(long CourseID) {
        this.CourseID = CourseID;
    }

    public long getUserID() {
        return this.UserID;
    }

    public void setUserID(long UserID) {
        this.UserID = UserID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFile() {
        return this.file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getStartDate() {
        return this.StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return this.EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}
