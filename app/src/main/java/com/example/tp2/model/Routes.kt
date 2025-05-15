package com.example.tp2.model

sealed class Routes(val route: String) {
    object PantallaInicio : Routes("pantallaInicio")
    object PantallaGame : Routes("pantallaGame")
}