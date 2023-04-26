package com.example.ouca

import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.MutableStateFlow
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState

open class CounterViewModel : KMMViewModel(){

    @NativeCoroutinesState
    val count = MutableStateFlow(viewModelScope, 0)

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