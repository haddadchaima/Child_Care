package com.example.mobileandroidnative;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class MyListData2 {
    private String titleComment;
    private String time;
    private String comments ;
    private int imgProfile ;
    public MyListData2(String titleComment, String time, String comments, int imgProfile) {
        this.titleComment = titleComment ;
        this.time = time ;
        this.comments = comments ;
        this.imgProfile = imgProfile ;
    }

    public String getTitleComment() {
        return titleComment;
    }

    public void setTitleComment(String titleComment) {
        this.titleComment = titleComment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }
}
