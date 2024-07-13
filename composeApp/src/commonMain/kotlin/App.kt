import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Box {
            LoginMolecule(
                onLoginClicked = { username, password ->
                },
                onForgotPasswordClicked = {
                },
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                textFieldModifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                buttonModifier = Modifier
                    .width(200.dp)
                    .height(48.dp),
                textModifier = Modifier
                    .padding(top = 16.dp)
            )
        }
    }
}