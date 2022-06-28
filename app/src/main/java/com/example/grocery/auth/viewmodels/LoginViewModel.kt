package com.example.grocery.auth.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.grocery.auth.state.LoginFormState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel  @Inject constructor(): ViewModel(){
    private val _state = mutableStateOf(LoginFormState())
    val state: State<LoginFormState> = _state
}