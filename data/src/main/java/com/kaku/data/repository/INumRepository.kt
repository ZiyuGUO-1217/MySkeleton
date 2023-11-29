package com.kaku.data.repository

import kotlinx.coroutines.flow.Flow

interface INumRepository {

    val num: Flow<String>

    fun addNum()

    fun minusNum()

    companion object {
        const val INIT_VALUE = 0
    }
}
