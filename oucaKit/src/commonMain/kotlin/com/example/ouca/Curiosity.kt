package com.example.ouca

sealed interface Curiosity {
    val name: String
    val latitude: Float
    val longitude: Float
}

data class HistoricCuriosity(
    override val name: String,
    override val latitude: Float,
    override val longitude: Float
): Curiosity

data class ArchitechturalCuriosity(
    override val name: String,
    override val latitude: Float,
    override val longitude: Float
): Curiosity

data class ArtCuriosity(
    override val name: String,
    override val latitude: Float,
    override val longitude: Float
): Curiosity