package com.kaku.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.update
import javax.inject.Inject

class DefaultNumRepository @Inject constructor() : INumRepository {
    private val _num = MutableStateFlow(INumRepository.INIT_VALUE)
    override val num: Flow<String> = _num.map { it.toString() }

    override fun addNum() {
        _num.update { it + 1 }
    }

    override fun minusNum() {
        _num.update { it - 1 }
    }

    override fun resetNum() {
        _num.update { INumRepository.INIT_VALUE }
    }
}
