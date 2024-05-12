package com.pablodev.projectrestapp.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pablodev.projectrestapp.model.User
import com.pablodev.projectrestapp.model.UserDao


@Database(entities = [User::class], version =1)
abstract class DbDataSource:RoomDatabase() {

    abstract fun userDao(): UserDao
}