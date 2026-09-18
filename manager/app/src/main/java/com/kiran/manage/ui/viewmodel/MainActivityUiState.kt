package com.kiran.manage.ui.viewmodel

import androidx.compose.runtime.Immutable
import com.kiran.manage.ui.UiMode
import com.kiran.manage.ui.theme.AppSettings

@Immutable
data class MainActivityUiState(
    val appSettings: AppSettings,
    val pageScale: Float,
    val enableBlur: Boolean,
    val enableFloatingBottomBar: Boolean,
    val enableFloatingBottomBarBlur: Boolean,
    val enableNavigationBadge: Boolean,
    val moduleDescriptionMaxLines: Int = 4,
    val uiMode: UiMode,
)
