package com.kaku.myskeleton

import androidx.lifecycle.ViewModel
import com.kaku.data.repository.INumRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val numRepository: INumRepository
) : ViewModel() {

}
