package com.example.ouca.android

import CuriosityView
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.myeline.ouca.android.CounterView
import com.example.ouca.CounterViewModel
import com.example.ouca.CuriosityViewModel
import com.example.ouca.Greeting

class MainActivity : ComponentActivity() {
    private val counterViewModel by viewModels<CounterViewModel>()
    private val curiosityViewModel by viewModels<CuriosityViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CounterView(counterViewModel)
                    CuriosityView(curiosityViewModel)
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
