package com.kaku.myskeleton

import androidx.lifecycle.ViewModel
import com.kaku.domain.repository.INumRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val numRepository: INumRepository
) : ViewModel() {

    fun resetData() {
        numRepository.resetNum()
    }
}
