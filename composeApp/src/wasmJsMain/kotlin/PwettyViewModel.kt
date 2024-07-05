
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

sealed class Screen {
    data object Dashboard : Screen()
    data object Transactions : Screen()
    data object MyWallet : Screen()
    data object Stats : Screen()
    data object Settings : Screen()
}

data class User(val name: String)

class PwettyViewModel: ViewModel() {
    private var _selectedScreen: MutableStateFlow<Screen> = MutableStateFlow(Screen.Dashboard)
    val selectedScreen: StateFlow<Screen> = _selectedScreen.asStateFlow()

    fun selectScreen(screen: Screen) {
        _selectedScreen.update { screen }
    }
}