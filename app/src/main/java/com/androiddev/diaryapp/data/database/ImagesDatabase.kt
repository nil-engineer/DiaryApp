package com.androiddev.diaryapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.androiddev.diaryapp.data.database.entity.ImageToUpload
import com.androiddev.diaryapp.data.database.entity.ImagesToUploadDao

@Database(entities = [ImageToUpload::class],
    version = 1, exportSchema = false)
abstract class ImagesDatabase : RoomDatabase() {
    abstract fun ImageToUploadDao(): ImagesToUploadDao
}