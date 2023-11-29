package com.kaku.data.di

import com.kaku.data.repository.INumRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.EntryPoints
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    //[NOTICE] return type must be an interface
    @Provides
    fun provideNumRepository(
        myComponentManager: MyComponentManager
    ): INumRepository = EntryPoints
        .get(myComponentManager, MyEntryPoint::class.java)
        .getNumRepository()
}
