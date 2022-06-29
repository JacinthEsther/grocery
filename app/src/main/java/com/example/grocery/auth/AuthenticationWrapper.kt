package com.example.grocery.auth

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.grocery.auth.viewmodels.AuthViewModel
import com.example.grocery.navigation.navhosts.AuthenticationNavigationHost

@Composable
fun AuthenticationWrapper(viewModel: AuthViewModel){
    val navController = rememberNavController()

    AuthenticationNavigationHost(navController = navController,
    authViewModel = viewModel)
}