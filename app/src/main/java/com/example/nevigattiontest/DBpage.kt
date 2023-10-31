package com.example.nevigattiontest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun DashboardPage(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Dashboard Page")
        Text(text = "Name: ${navController.currentBackStackEntry?.arguments?.getString("name")}")
        Text(text = "Phone: ${navController.currentBackStackEntry?.arguments?.getString("phone")}")
        Button(onClick = { navController.navigateUp() }) { Text(text = "Go Back") }


    }
}
