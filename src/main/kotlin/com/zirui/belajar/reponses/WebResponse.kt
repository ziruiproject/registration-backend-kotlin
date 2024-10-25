package com.zirui.belajar.reponses

data class WebResponse<T>(
    val code: Int,
    val status: String,
    val error: String,
    val message: String,
    val data: T
)