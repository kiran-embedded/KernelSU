package com.kiran.manage.ui.component.uninstalldialog

import androidx.compose.runtime.Composable
import com.kiran.manage.ui.LocalUiMode
import com.kiran.manage.ui.UiMode

@Composable
fun UninstallDialog(
    show: Boolean,
    onDismissRequest: () -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> UninstallDialogMiuix(show, onDismissRequest)
        UiMode.Material -> UninstallDialogMaterial(show, onDismissRequest)
    }
}
