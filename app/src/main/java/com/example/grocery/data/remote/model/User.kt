package com.example.grocery.data.remote.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("_id")
    val id : String,
    val email: String,
    val firstname: String,
    val lastname: String
)
