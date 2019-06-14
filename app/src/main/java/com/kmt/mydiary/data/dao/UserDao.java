package com.kmt.mydiary.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.kmt.mydiary.data.model.User;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT*FROM User")
    List<User> getAll();

    @Query("SELECT COUNT( *) from user")
    int countUsers();

    @Query("SELECT*FROM user where username")
    User findByUsername(String firstName);

    @Insert
    void insertAll(User... User);

    @Delete
    void delete(User user);
}
