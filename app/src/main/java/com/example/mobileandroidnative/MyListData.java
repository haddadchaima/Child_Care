package com.example.mobileandroidnative;

public class MyListData{
    private String titleComment;
    private String time;
    private String comments ;
    public MyListData(String titleComment, String time, String comments) {
        this.titleComment = titleComment ;
        this.time = time ;
        this.comments = comments ;
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
}
