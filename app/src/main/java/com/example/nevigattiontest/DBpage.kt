package com.example.nevigattiontest

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DashboardPage(navController: NavController)
{
    Column {
        Text(text = "Dashboard Page")

        Button(onClick = { navController.navigateUp() }) { Text(text = "Go Back") }


    }
}

