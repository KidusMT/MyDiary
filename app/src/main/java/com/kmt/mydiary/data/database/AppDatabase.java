package com.kmt.mydiary.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.kmt.mydiary.data.dao.DiaryDao;
import com.kmt.mydiary.data.dao.UserDao;
import com.kmt.mydiary.data.model.Diary;
import com.kmt.mydiary.data.model.User;

@Database(entities = {User.class, Diary.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "diary_database")
                            .build();
                    // allow queries on the main thread.
                    // Don’t do this on a real app! See PersistenceBasicSample for an example.
                    // .allowMainThreadQueries()

                }
            }
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    public abstract UserDao userDao();

    public abstract DiaryDao diaryDao();

}
