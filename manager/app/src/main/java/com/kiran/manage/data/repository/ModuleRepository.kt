package com.kiran.manage.data.repository

import com.kiran.manage.data.model.Module
import com.kiran.manage.data.model.ModuleUpdateInfo

interface ModuleRepository {
    suspend fun getModules(): Result<List<Module>>
    suspend fun checkUpdate(module: Module): Result<ModuleUpdateInfo>
}
