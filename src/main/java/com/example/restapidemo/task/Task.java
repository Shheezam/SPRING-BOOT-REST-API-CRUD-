package com.example.restapidemo.task;


import jakarta.persistence.*;

@Entity
public class Task {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;


 private String title;
private String description;
 private String completed;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}

