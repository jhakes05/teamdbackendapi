package com.teamd.teamdbackendapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Certification {
    @Id
    @GeneratedValue

    private long CertificateID;
    private String certificateSerialNo;
    private long CourseID;
    private long UserID;
    private long InstructorID;
    private long SupportID;
    private String dateIssued;
    private String certificateFile;
    private long BadgeID;
    private String criteria;



    public long getCertificateID() {
        return this.CertificateID;
    }

    public void setCertificateID(long CertificateID) {
        this.CertificateID = CertificateID;
    }

    public String getCertificateSerialNo() {
        return this.certificateSerialNo;
    }

    public void setCertificateSerialNo(String certificateSerialNo) {
        this.certificateSerialNo = certificateSerialNo;
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

    public long getInstructorID() {
        return this.InstructorID;
    }

    public void setInstructorID(long InstructorID) {
        this.InstructorID = InstructorID;
    }

    public long getSupportID() {
        return this.SupportID;
    }

    public void setSupportID(long SupportID) {
        this.SupportID = SupportID;
    }

    public String getDateIssued() {
        return this.dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    public String getCertificateFile() {
        return this.certificateFile;
    }

    public void setCertificateFile(String certificateFile) {
        this.certificateFile = certificateFile;
    }

    public long getBadgeID() {
        return this.BadgeID;
    }

    public void setBadgeID(long BadgeID) {
        this.BadgeID = BadgeID;
    }

    public String getCriteria() {
        return this.criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

}
