package com.example.api.room;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
/*
@Database(entities = {Entity_class.class},version = 1)
public abstract class Roomdatabase_class extends RoomDatabase {

    public abstract TodoDao todoDao();
    private static volatile Roomdatabase_class Instance;
    static Roomdatabase_class getInstance(Context context){
        if(Instance ==null)
        {
             synchronized (Roomdatabase_class.class)
             {
                 if(Instance==null)
                 {
                     Instance= Room.databaseBuilder(context.getApplicationContext(),
                             Roomdatabase_class.class,
                             "DB_NAME").build();
                 }
             }
        }
        return Instance;
    }
}


 */

