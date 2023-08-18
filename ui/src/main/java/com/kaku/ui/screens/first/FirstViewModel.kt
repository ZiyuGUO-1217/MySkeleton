package com.kaku.ui.screens.first

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kaku.data.repository.INumRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(
    private val numRepository: INumRepository
) : ViewModel() {

    val num : StateFlow<String> = numRepository.num.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000L),
        initialValue = "null"
    )

    fun addNumber() {
        numRepository.addNum()
    }

    fun minusNumber() {
        numRepository.minusNum()
    }
}
