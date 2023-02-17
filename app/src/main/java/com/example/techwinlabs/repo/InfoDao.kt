package com.example.techwinlabs.repo

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface InfoDao {

  @Insert
  fun insert(note: Info)

  @Update
  fun update(note: Info)

  @Delete
  fun delete(note: Info)

  @Query("delete from info_table")
  fun deleteAllNotes()

  @Query("select * from info_table")
  fun getAllNotes(): LiveData<List<Info>>
}