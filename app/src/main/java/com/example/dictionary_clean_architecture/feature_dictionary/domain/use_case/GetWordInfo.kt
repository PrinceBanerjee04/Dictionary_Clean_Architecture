package com.example.dictionary_clean_architecture.feature_dictionary.domain.use_case

import com.example.dictionary_clean_architecture.core.util.Resource
import com.example.dictionary_clean_architecture.feature_dictionary.domain.model.WordInfo
import com.example.dictionary_clean_architecture.feature_dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if(word.isBlank()) {
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}