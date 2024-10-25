package com.zirui.belajar.requests

data class CreateUserRequest(
    val email: String,
    val fullName: String,
    val password: String,
)