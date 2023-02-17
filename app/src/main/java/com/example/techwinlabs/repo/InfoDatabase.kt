package com.example.techwinlabs.repo

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Info::class], version = 1)
abstract class InfoDatabase : RoomDatabase() {
    abstract fun getDao(): InfoDao
    companion object{
      private var INSTANCE : InfoDatabase? = null


      fun getDatabaseInstance(context: Context): InfoDatabase{
        return if (INSTANCE == null){
          val builder = Room.databaseBuilder(
            context.applicationContext,
            InfoDatabase::class.java,
            "infoDatabase"
          )
          builder.fallbackToDestructiveMigration()
          INSTANCE = builder.build()
          INSTANCE!!
        }else INSTANCE!!
      }

    }

}
