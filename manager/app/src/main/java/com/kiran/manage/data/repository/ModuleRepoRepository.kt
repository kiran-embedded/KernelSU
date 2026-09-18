package com.kiran.manage.data.repository

import com.kiran.manage.data.model.RepoModule

interface ModuleRepoRepository {
    suspend fun fetchModules(): Result<List<RepoModule>>
}
