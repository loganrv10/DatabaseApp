package com.example.techwinlabs.repo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "info_table")
data class Info(
  val title: String,
  val description: String,
  val priority: Int,
  @PrimaryKey(autoGenerate = false) val id: Int? = null)

