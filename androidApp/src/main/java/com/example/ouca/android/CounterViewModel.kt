package app.myeline.ouca.android

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow

class CounterViewModel : ViewModel() {
    val count = MutableStateFlow(0)

    fun incrementCount() {
        if(count.value < 25) count.value++
    }

    fun decrementCount() {
        if(count.value > 0) count.value--
    }

    fun resetCount() {
        count.value = 0
    }

}