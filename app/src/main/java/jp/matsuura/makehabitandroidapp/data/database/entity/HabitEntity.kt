package jp.matsuura.makehabitandroidapp.data.database.entity

import java.time.OffsetDateTime

data class HabitEntity(
    val id: Int,
    val genre: HabitGenreEntity,
    val startAt: OffsetDateTime,
    val endAt: OffsetDateTime,
    val createdAt: OffsetDateTime,
    val updatedAt: OffsetDateTime,
)