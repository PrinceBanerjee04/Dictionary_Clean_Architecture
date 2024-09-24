package com.example.dictionary_clean_architecture.feature_dictionary.domain.model


data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)
