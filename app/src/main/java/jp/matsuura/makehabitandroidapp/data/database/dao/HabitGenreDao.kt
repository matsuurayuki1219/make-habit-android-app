package jp.matsuura.makehabitandroidapp.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import jp.matsuura.makehabitandroidapp.data.database.entity.HabitGenreEntity

@Dao
interface HabitGenreDao {
    @Query("SELECT * FROM habit_genre")
    fun getAll(): List<HabitGenreEntity>
}