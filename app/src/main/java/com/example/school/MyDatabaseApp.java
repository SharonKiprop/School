package com.example.school;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class, Class.class, Teacher.class},version = 1
        ,exportSchema = false)
public abstract class MyDatabaseApp extends RoomDatabase {
    private static  MyDatabaseApp myDatabaseApp = null;
    public  abstract MyDao getDao();
    public  static  MyDatabaseApp CreateDbInstance(Context context){
      if (myDatabaseApp == null) {
          myDatabaseApp= Room.databaseBuilder(context.getApplicationContext(),MyDatabaseApp.class,"SchoolDB")
                   .build();

      }
      return myDatabaseApp;
    }
}
