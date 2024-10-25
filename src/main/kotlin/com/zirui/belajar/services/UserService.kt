package com.zirui.belajar.services

import com.zirui.belajar.reponses.users.UserResponse
import com.zirui.belajar.requests.CreateUserRequest

interface UserService {

    fun create(createUserRequest: CreateUserRequest): UserResponse

}