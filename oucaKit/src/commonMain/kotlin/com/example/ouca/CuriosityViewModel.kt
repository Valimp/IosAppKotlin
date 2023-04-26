package com.example.ouca

import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.MutableStateFlow
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState

class CuriosityViewModel: KMMViewModel() {

    val historicCuriosity1 = HistoricCuriosity(
        name = "Keops Pyramids",
        latitude = 0F,
        longitude = 0F
    )
    val historicCuriosity2 = HistoricCuriosity(
        name = "Liberty statue",
        latitude = 1F,
        longitude = 0F
    )
    val historicCuriosity3 = HistoricCuriosity(
        name = "Eiffel Tower",
        latitude = 0F,
        longitude = 1F
    )

    val curiosities = listOf<HistoricCuriosity>(historicCuriosity1, historicCuriosity2, historicCuriosity3)

    @NativeCoroutinesState
    val index = MutableStateFlow(viewModelScope, 0)
    val currentCuriosity = MutableStateFlow(viewModelScope, curiosities[index.value])

    fun getNextCuriosity(){
        if (index.value < curiosities.size - 1) {
            index.value++
            currentCuriosity.value = curiosities[index.value]
        }
    }
    fun getBeforeCuriosity(){
        if (index.value > 0) {
            index.value--
            currentCuriosity.value = curiosities[index.value]
        }
    }
}