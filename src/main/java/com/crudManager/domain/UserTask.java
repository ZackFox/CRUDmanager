package com.crudManager.domain;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "mytask")
public class UserTask {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "taskField")
    private String text;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
