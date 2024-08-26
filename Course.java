package com.example.LCWDAPI.Entities;

public class Course {

    private long id;
    private String title;
    private String Discription;

    public Course(long id, String title, String discription) {
        super();
        this.id = id;
        this.title = title;
        Discription = discription;
    }

    public Course(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", title='" + title + '\'' + ", Discription='" + Discription + '\'' + '}';
    }
}
