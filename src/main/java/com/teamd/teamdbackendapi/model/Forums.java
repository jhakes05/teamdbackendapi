package com.teamd.teamdbackendapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Forums {
    @Id
    @GeneratedValue

    private long ForumID;
    private long UserID;
    private long InstructorID;
    private String title;
    private String description;
    private String datePosted;


    public long getForumID() {
        return this.ForumID;
    }

    public void setForumID(long ForumID) {
        this.ForumID = ForumID;
    }

    public long getUserID() {
        return this.UserID;
    }

    public void setUserID(long UserID) {
        this.UserID = UserID;
    }

    public long getInstructorID() {
        return this.InstructorID;
    }

    public void setInstructorID(long InstructorID) {
        this.InstructorID = InstructorID;
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

    public String getDatePosted() {
        return this.datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

}
