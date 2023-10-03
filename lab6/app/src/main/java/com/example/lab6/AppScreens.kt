package com.example.lab6

sealed class AppScreens(val route: String) {
    object MenuScreen:AppScreens("menu_screen")
    object ImageScreen:AppScreens("menu_screen")
}