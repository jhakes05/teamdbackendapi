package com.teamd.teamdbackendapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Instructor {
@Id
@GeneratedValue

private long InstructorID;
private String full_name;
private String username;
private String email;
private String password;
private String profile;
private String instructor_signature;



    public long getInstructorID() {
        return this.InstructorID;
    }

    public void setInstructorID(long InstructorID) {
        this.InstructorID = InstructorID;
    }

    public String getFull_name() {
        return this.full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile() {
        return this.profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getInstructor_signature() {
        return this.instructor_signature;
    }

    public void setInstructor_signature(String instructor_signature) {
        this.instructor_signature = instructor_signature;
    }

}
