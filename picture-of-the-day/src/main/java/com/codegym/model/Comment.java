package com.codegym.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String feedback;
    private String author;
    private String date;
    private String rating;
    private int likes;

    public Comment() {
    }

    public Comment(String feedback, String author, String date, String rating, int likes) {
        this.feedback = feedback;
        this.author = author;
        this.date = date;
        this.rating = rating;
        this.likes = likes;
    }

    public Comment(long id, String feedback, String author, String date, String rating, int likes) {
        this.id = id;
        this.feedback = feedback;
        this.author = author;
        this.date = date;
        this.rating = rating;
        this.likes = likes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today = LocalDate.now();
        this.date = today.format(formatter);
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
