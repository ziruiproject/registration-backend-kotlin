package com.zirui.belajar.controllers

import com.zirui.belajar.reponses.WebResponse
import com.zirui.belajar.reponses.users.UserResponse
import com.zirui.belajar.requests.CreateUserRequest
import com.zirui.belajar.services.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController(value = "/users")
class UserController(
    private val userService: UserService
) {

    @PostMapping(
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createUser(@RequestBody body: CreateUserRequest) : WebResponse<UserResponse> {
        val response : UserResponse =  userService.create(body)

        return WebResponse(
            code = 200,
            error = "",
            status = "OK",
            message = "User berhasil dibuat!",
            data = response,
        )
    }
}