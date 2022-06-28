package com.example.grocery.auth.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.grocery.R
import com.example.grocery.navigation.destinations.Destination

@Composable
fun Login(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.2f),
        contentAlignment = Alignment.Center)
        {
           Image(
               painter = painterResource(id = R.drawable.logo ), contentDescription = ""
           )
        }
        Text(text = "Login",
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier=Modifier.height(10.dp))
        Text(text = "enter your email and password",
        fontSize = 16.sp,
        color = Color(0xff7C7C7C))
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLogin(){
//    Login()
}
