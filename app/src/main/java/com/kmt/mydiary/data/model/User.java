package com.kmt.mydiary.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "user")
public class User implements Serializable {

    @ColumnInfo(name = "name")
    String name;

    @ColumnInfo(name = "password")
    String password;

    @ColumnInfo(name = "username")
    String username;

    @ColumnInfo(name = "email")
    String email;

    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }

    public User(String name, String password, String username, String email) {
        this.name = name;
        this.password = password;
        this.username = username;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
