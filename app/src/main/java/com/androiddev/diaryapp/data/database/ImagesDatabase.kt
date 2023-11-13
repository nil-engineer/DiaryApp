package com.androiddev.diaryapp.data.database

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.androiddev.diaryapp.data.database.entity.ImageToDelete
import com.androiddev.diaryapp.data.database.entity.ImageToUpload
import com.androiddev.diaryapp.data.database.entity.ImageToUploadDao

@Database(
    entities = [ImageToUpload::class, ImageToDelete::class],
    version = 1,
    exportSchema = true,
//    autoMigrations = [
//        AutoMigration (from = 1, to = 2)
//    ]
)
abstract class ImagesDatabase : RoomDatabase() {
    abstract fun ImageToUploadDao(): ImageToUploadDao
    abstract fun ImageToDeleteDao(): ImageToDeleteDao

}