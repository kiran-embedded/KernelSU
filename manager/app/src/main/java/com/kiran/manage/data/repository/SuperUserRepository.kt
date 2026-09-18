package com.kiran.manage.data.repository

import com.kiran.manage.data.model.AppInfo

interface SuperUserRepository {
    suspend fun getAppList(): Result<Pair<List<AppInfo>, List<Int>>>
    suspend fun refreshProfiles(currentApps: List<AppInfo>): Result<List<AppInfo>>
}
