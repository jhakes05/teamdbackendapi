package com.teamd.teamdbackendapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Forums_Comments {
    @Id
    @GeneratedValue

    private long CommentID;
    private long ForumID;
    private long UserID;
    private long InstructorID;
    private String description;
    private String dateCommented;
    


    public long getCommentID() {
        return this.CommentID;
    }

    public void setCommentID(long CommentID) {
        this.CommentID = CommentID;
    }

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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateCommented() {
        return this.dateCommented;
    }

    public void setDateCommented(String dateCommented) {
        this.dateCommented = dateCommented;
    }

}
