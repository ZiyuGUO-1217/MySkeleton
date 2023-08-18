package com.kaku.data.di

import com.kaku.data.repository.DefaultNumRepository
import com.kaku.data.repository.INumRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindNumRepository(
        numRepository: DefaultNumRepository
    ): INumRepository
}
