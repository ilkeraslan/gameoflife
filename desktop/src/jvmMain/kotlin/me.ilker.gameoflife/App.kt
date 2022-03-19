import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.awt.ComposeWindow
import androidx.compose.ui.window.Window
import me.ilker.common.getPlatformName

@Composable
fun app() {
    var text by remember { mutableStateOf("Hello, World!") }

    Window(
        create = {
            val window = ComposeWindow()
            window.setContent {

            }
            window
        },
        dispose = {}
    ) {
        MaterialTheme {
            Button(onClick = {
                text = "Hello, ${getPlatformName()}"
            }) {
                Text(text)
            }
        }
    }
}
