package com.sourabh_projects.easynews.domain.manager.usecases

import com.sourabh_projects.easynews.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry (
    private val localUserManager: LocalUserManager
) {
   operator fun  invoke(): Flow<Boolean>
    {
        return localUserManager.readAppEntry()
    }
}