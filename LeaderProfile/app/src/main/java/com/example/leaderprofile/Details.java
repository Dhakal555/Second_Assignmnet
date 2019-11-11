package com.example.leaderprofile;

public class Details {
    private String name, details;
    private int imageID;

    public Details(String name, int iamgeID, String details){
        this.name = name;
        this.imageID = iamgeID;
        this.details = details;

    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name ; }

    public int getImageID() { return imageID; }
    public void setName(int imageID) { this.imageID = imageID ; }

    public String getdetails() { return details; }
    public void setDetails(String details) { this.details = details ; }

}
