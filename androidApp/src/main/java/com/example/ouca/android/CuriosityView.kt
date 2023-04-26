import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ouca.CounterViewModel
import com.example.ouca.CuriosityViewModel

@Composable
fun CuriosityView(curiosityViewModel: CuriosityViewModel) {
    //var count by remember { mutableStateOf(0) }
    val curiosity by curiosityViewModel.currentCuriosity.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color(0xFF7b904b))
    ) {
        Text(
            text = "${curiosity.name}",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF002400)
        )
        Text(
            text = "Longitude : ${curiosity.longitude}",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF002400)
        )
        Text(
            text = "Latitude : ${curiosity.latitude}",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF002400)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { curiosityViewModel.getBeforeCuriosity() },
            modifier = Modifier
                .width(100.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(157, 92, 99)
            )
        ) {
            Text(text = "-")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { curiosityViewModel.getNextCuriosity() },
            modifier = Modifier
                .width(100.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(157, 92, 99)
            )
        ) {
            Text(text = "+")
        }
    }
}