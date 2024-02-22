package com.sourabh_projects.easynews.domain.manager.usecases

import com.sourabh_projects.easynews.domain.manager.LocalUserManager

class SaveAppEntry (
    private val localUserManager: LocalUserManager
)
{

    suspend operator fun  invoke() = localUserManager.saveAppEntry()
}
