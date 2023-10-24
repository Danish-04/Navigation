package com.example.nevigattiontest

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ProfilePage(navController: NavController) {
    Column {
        Text(text = "Profile Page")
        Button(onClick = {
            navController.navigate("dashboard")
        }) {
            Text(text = "Go to Dashboard")
        }
    }
}