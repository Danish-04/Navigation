package com.example.nevigattiontest

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "profile") {
        composable("profile") { ProfilePage(navController) }
        composable("dashboard") { DashboardPage() }
    }
}

