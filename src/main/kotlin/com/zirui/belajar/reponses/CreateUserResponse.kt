package com.zirui.belajar.reponses

import jakarta.validation.constraints.NotNull

data class CreateUserResponse(
    @NotNull
    val email: String,
    val password: String,
    val fullName: String,
)