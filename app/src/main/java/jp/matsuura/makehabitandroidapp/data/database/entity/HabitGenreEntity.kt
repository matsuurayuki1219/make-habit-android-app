package jp.matsuura.makehabitandroidapp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habit_genre")
data class HabitGenreEntity(
    @PrimaryKey val id: Int,
    val title: String,
    val description: String,
)