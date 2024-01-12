package com.teamd.teamdbackendapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
@Id
@GeneratedValue

private long CourseID;
private long InstructorID;
private String Title;
private String Description;
private String File;
private String Image;
private String StartDate;
private String EndDate;


    public long getCourseID() {
        return this.CourseID;
    }

    public void setCourseID(long CourseID) {
        this.CourseID = CourseID;
    }

    public long getInstructorID() {
        return this.InstructorID;
    }

    public void setInstructorID(long InstructorID) {
        this.InstructorID = InstructorID;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getFile() {
        return this.File;
    }

    public void setFile(String File) {
        this.File = File;
    }

    public String getImage() {
        return this.Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
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


}
