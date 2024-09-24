package com.example.dictionary_clean_architecture.feature_dictionary.data.local

import androidx.room.Database
import androidx.room.TypeConverters
import com.example.dictionary_clean_architecture.feature_dictionary.data.local.entity.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class WordInfoDatabase {
    abstract val dao: WordInfoDao
}