package com.example.dictionary_clean_architecture.feature_dictionary.data.remote.dto

data class Definition(
    val antonyms: List<Any>,
    val definition: String,
    val example: String,
    val synonyms: List<String>
)