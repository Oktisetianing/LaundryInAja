package com.example.laundryapp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.laundryapp.Model.ModelLaundry;

@Database(entities = {ModelLaundry.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LaundryDao laundryDao();
}
