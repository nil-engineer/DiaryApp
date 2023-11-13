package com.androiddev.diaryapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.androiddev.diaryapp.data.database.entity.ImageToDelete
import com.androiddev.diaryapp.data.database.entity.ImageToUpload
import com.androiddev.diaryapp.data.database.entity.ImageToUploadDao

@Database(
    entities = [ImageToUpload::class, ImageToDelete::class],
    version = 2, exportSchema = false
)
abstract class ImagesDatabase : RoomDatabase() {
    abstract fun ImageToUploadDao(): ImageToUploadDao
    abstract fun ImageToDeleteDao(): ImageToDeleteDao

}