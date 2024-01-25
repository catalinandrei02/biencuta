package com.bor.biencuta.photo.infra

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bor.biencuta.photo.core.PhotoRepository
import javax.inject.Inject

class PhotoRepositoryImpl @Inject constructor(): PhotoRepository {

    override fun getImageUrls(): LiveData<List<String>> {

        val resultLiveData = MutableLiveData<List<String>>()

        // Simulate a network call to fetch image URLs
        // In a real app, replace this with actual network or data source calls
        // For simplicity, I'm providing a static list of image URLs
        val staticImageUrls = listOf(
            "https://i.ibb.co/QbtYK8M/IMG-2031.jpg",
            "https://i.ibb.co/KxwzgV6/IMG-2049.jpg",
            "https://i.ibb.co/Yc9SqJm/IMG-2091.jpg"
        )

        // Post the result to LiveData
        resultLiveData.postValue(staticImageUrls)

        return resultLiveData
    }
}