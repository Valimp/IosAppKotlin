package app.myeline.ouca.android

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

@Composable
fun CounterView(counterViewModel: CounterViewModel) {
    //var count by remember { mutableStateOf(0) }
    val count by counterViewModel.count.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color(240, 255, 235))
    ) {
        Text(
            text = "$count",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            color = Color(102, 161, 130)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Button(
                onClick = { counterViewModel.decrementCount() },
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp),
                colors = if(count > 0) {
                    ButtonDefaults.buttonColors(
                        backgroundColor = Color(202, 255, 185)
                    )
                } else {
                    ButtonDefaults.buttonColors(
                        backgroundColor = Color(220, 220, 220)
                    )
                }
            ) {
                Text(text = "<")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { counterViewModel.incrementCount() },
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp),
                colors = if(count < 25) {
                    ButtonDefaults.buttonColors(
                        backgroundColor = Color(202, 255, 185)
                    )
                } else {
                    ButtonDefaults.buttonColors(
                        backgroundColor = Color(220, 220, 220)
                    )
                }
            ) {
                Text(text = ">")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { counterViewModel.resetCount() },
            modifier = Modifier
                .width(100.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(174, 247, 142)
            )
        ) {
            Text(text = "Reset")
        }
        Spacer(modifier = Modifier.height(72.dp))
        LinearProgressIndicator(
            progress = count.toFloat()/25,
            color = Color(102, 161, 130)
        )
    }
}