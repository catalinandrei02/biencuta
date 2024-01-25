package com.bor.biencuta.photo.di

import com.bor.biencuta.photo.core.PhotoRepository
import com.bor.biencuta.photo.infra.PhotoRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface PhotoModule {

    @Binds
    fun bindPhotoRepo(photoRepositoryImpl: PhotoRepositoryImpl): PhotoRepository
}