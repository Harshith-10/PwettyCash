
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.lifecycle.viewmodel.compose.viewModel
import org.jetbrains.compose.resources.Font
import pwettycash.composeapp.generated.resources.Res
import pwettycash.composeapp.generated.resources.playwrite
import ui.DashboardUI

@Composable
fun App() {
    MaterialTheme {
        val logoFontFamily = FontFamily(Font(Res.font.playwrite))
        val viewModel = viewModel { PwettyViewModel() }

        //LoginUI(logoFontFamily)
        DashboardUI(logoFontFamily, viewModel)
    }
}