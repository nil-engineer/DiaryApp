package com.androiddev.mongo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.androiddev.mongo.database.entity.ImageToDelete
import com.androiddev.mongo.database.entity.ImageToUpload

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