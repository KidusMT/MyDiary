package com.kmt.mydiary.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.kmt.mydiary.data.model.Diary;

import java.util.List;

@Dao
public interface DiaryDao {

    @Query("SELECT*FROM diary")
    List<Diary> getAll();

    @Query("SELECT COUNT( *) from diary")
    int countDiaries();

    @Query("SELECT*FROM diary where title")
    Diary findByTitle(String title);

    @Insert
    void insertAll(Diary... diary);

    @Delete
    void delete(Diary diary);

}
