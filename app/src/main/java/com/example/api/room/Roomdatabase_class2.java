package com.example.api.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Entity_class2.class},version = 2)
public abstract class Roomdatabase_class2 extends RoomDatabase {

    public abstract TodoDao todoDao2();
    private static volatile Roomdatabase_class2 Instance2;

    static Roomdatabase_class2 getInstance(Context context)
    {
        if(Instance2==null)
        {
            synchronized (Roomdatabase_class2.class)
            {
                if(Instance2==null)
                {
                    Instance2= Room.databaseBuilder(context.getApplicationContext(),
                            Roomdatabase_class2.class,"DBName2").build();
                }
            }
        }
        return Instance2;
    }


}
