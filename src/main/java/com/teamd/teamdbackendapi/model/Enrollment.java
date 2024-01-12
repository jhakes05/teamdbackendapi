package com.teamd.teamdbackendapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Enrollment {
    @Id
    @GeneratedValue

    private long enrollmentID;
    private long CourseID;
    private long UserID;
    private long SupportID;
    private long InstructorID;
    private String enrollmentDate;
    private String cancelled;
    private String cancellationReason;



    public long getEnrollmentID() {
        return this.enrollmentID;
    }

    public void setEnrollmentID(long enrollmentID) {
        this.enrollmentID = enrollmentID;
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

    public long getSupportID() {
        return this.SupportID;
    }

    public void setSupportID(long SupportID) {
        this.SupportID = SupportID;
    }

    public long getInstructorID() {
        return this.InstructorID;
    }

    public void setInstructorID(long InstructorID) {
        this.InstructorID = InstructorID;
    }

    public String getEnrollmentDate() {
        return this.enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getCancelled() {
        return this.cancelled;
    }

    public void setCancelled(String cancelled) {
        this.cancelled = cancelled;
    }

    public String getCancellationReason() {
        return this.cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

}
