package com.bor.biencuta.main.presentation

import androidx.lifecycle.ViewModel
import com.bor.biencuta.main.core.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
): ViewModel() {

    fun getData() = mainRepository.getData()
}