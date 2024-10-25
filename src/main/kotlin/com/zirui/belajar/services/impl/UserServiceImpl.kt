package com.zirui.belajar.services.impl
import com.zirui.belajar.entities.User
import com.zirui.belajar.reponses.users.UserResponse
import com.zirui.belajar.repositories.UserRepository
import com.zirui.belajar.requests.CreateUserRequest
import com.zirui.belajar.services.UserService
import org.springframework.security.crypto.bcrypt.BCrypt
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val repository: UserRepository) : UserService {
    override fun create(createUserRequest: CreateUserRequest): UserResponse {
        val salt : String = BCrypt.gensalt(4)

        val user = User(
            email = createUserRequest.email,
            fullName = createUserRequest.fullName,
            password = BCrypt.hashpw(createUserRequest.password, salt),
        )

        repository.save(user)

        return UserResponse(
            id = user.id,
            email = user.email,
            fullName = user.fullName,
        )

    }
}