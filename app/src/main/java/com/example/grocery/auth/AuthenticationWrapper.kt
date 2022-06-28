package com.example.grocery.auth

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.grocery.navigation.navhosts.AuthenticationNavigationHost

@Composable
fun AuthenticationWrapper(){
    val navHostController = rememberNavController()

    AuthenticationNavigationHost(navHostController = navHostController)
}