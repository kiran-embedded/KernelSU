package com.kiran.manage.data.repository

import com.kiran.manage.data.model.TemplateInfo

interface TemplateRepository {
    suspend fun getTemplates(sync: Boolean): Result<List<TemplateInfo>>
    suspend fun importTemplates(jsonString: String): Result<Unit>
    suspend fun exportTemplates(): Result<String>
    suspend fun getTemplate(id: String): Result<TemplateInfo>
}
