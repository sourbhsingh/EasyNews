package com.sourabh_projects.easynews.di

import android.app.Application
import com.sourabh_projects.easynews.NewsApplication
import com.sourabh_projects.easynews.data.manager.LocalUserManagerImp
import com.sourabh_projects.easynews.domain.manager.LocalUserManager
import com.sourabh_projects.easynews.domain.manager.usecases.AppEntryUseCases
import com.sourabh_projects.easynews.domain.manager.usecases.ReadAppEntry
import com.sourabh_projects.easynews.domain.manager.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application : Application
    ): LocalUserManager = LocalUserManagerImp(application)


    @Provides
    @Singleton
    fun provideAppEntryUses(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases (
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry =  SaveAppEntry(localUserManager)
    )
}