package com.teamd.teamdbackendapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Badge {
    @Id
    @GeneratedValue
    private long BadgeID;
    private String badgeName;
    private String badgeImage;



    public long getBadgeID() {
        return this.BadgeID;
    }

    public void setBadgeID(long BadgeID) {
        this.BadgeID = BadgeID;
    }

    public String getBadgeName() {
        return this.badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public String getBadgeImage() {
        return this.badgeImage;
    }

    public void setBadgeImage(String badgeImage) {
        this.badgeImage = badgeImage;
    }

}
