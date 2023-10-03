package com.example.lab6

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.MenuScreen.route){
        composable(route = AppScreens.MenuScreen.route){
            menuLayout(navController)
        }
    }
}