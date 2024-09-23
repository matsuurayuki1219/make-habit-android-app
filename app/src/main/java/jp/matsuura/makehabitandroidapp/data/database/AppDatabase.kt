package jp.matsuura.makehabitandroidapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import jp.matsuura.makehabitandroidapp.data.database.dao.HabitGenreDao
import jp.matsuura.makehabitandroidapp.data.database.entity.HabitGenreEntity

@Database(
    entities = [HabitGenreEntity::class],
    version = 1,
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun habitDao(): HabitGenreDao
}