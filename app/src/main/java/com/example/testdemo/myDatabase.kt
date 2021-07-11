package com.example.testdemo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(User::class),version = 1,exportSchema = false)
abstract class myDatabase : RoomDatabase() {
    abstract fun userDao():UserDao
}