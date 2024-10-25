package com.zirui.belajar.services
import com.zirui.belajar.entities.User
import com.zirui.belajar.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val repository: UserRepository) {
    fun findAll(): List<User> = repository.findAll()
    fun findById(Id: Long) = repository.findById(Id)
    fun create(user: User): User = repository.save(user)
    fun update(user: User, id: Long): User {
        val user : User? = repository.findById(id).orElse(null)

        if (user != null) {
            repository.save(user)
        }


    }
}