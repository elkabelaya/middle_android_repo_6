package ru.yandexpraktikum.core.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.yandexpraktikum.core.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1, exportSchema = false)
internal abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}