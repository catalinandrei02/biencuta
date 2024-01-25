package com.bor.biencuta.main.di

import com.bor.biencuta.main.core.MainRepository
import com.bor.biencuta.main.infra.MainRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface MainModule {

    @Binds
    fun bindMainRepo(mainRepositoryImpl: MainRepositoryImpl): MainRepository

    companion object {

        @Provides
        @Singleton
        fun something() : String = "Biencuta"
    }
}