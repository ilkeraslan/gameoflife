package me.ilker.common

import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.application

fun main() = application {
    Window {
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Hello world")
        }
    }
}

actual fun getPlatformName() = "Desktop"
