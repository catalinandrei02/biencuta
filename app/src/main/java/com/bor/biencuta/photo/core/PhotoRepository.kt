package com.bor.biencuta.photo.core

import androidx.lifecycle.LiveData

interface PhotoRepository {

    fun getImageUrls(): LiveData<List<String>>
}