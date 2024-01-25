package com.bor.biencuta.photo.presentation

import androidx.lifecycle.ViewModel
import com.bor.biencuta.photo.core.PhotoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PhotoViewModel @Inject constructor(
    private val photoRepository: PhotoRepository
) : ViewModel() {

    fun getImagesUrls() = photoRepository.getImageUrls()
}