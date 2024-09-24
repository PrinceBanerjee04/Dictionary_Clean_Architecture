package com.example.dictionary_clean_architecture.feature_dictionary.data.remote.dto

data class WordInfoDtoItem(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val sourceUrls: List<String>,
    val word: String
)