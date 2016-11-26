package com.crudManager.domain;

import javax.persistence.Entity;
import javax.persistence.Table;


public class UserTask {

    private int id;

    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
