package com.example.api;

public class PostPojo{
    private float id;
    private float userId;
    private String title;
   private String body;
   private boolean completed;
//For post request
    public PostPojo(float userId, String title, boolean completed) {
        this.userId = userId;
        this.title = title;
        this.completed = completed;
    }
  ///Getter and Setter

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getUserId() {
        return userId;
    }

    public void setUserId(float userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    //toString

    @Override
    public String toString() {
        return "PostPojo{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", completed=" + completed +
                '}';
    }
}