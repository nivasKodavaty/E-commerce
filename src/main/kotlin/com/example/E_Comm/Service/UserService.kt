package com.example.E_Comm.Service

import com.example.E_Comm.Model.Users
import com.example.E_Comm.Repositories.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {
    @Transactional
    fun saveUser(user: Users): Users {
        val encodedPassword = passwordEncoder.encode(user.password)
        user.password = encodedPassword;
        return userRepository.save(user)
    }
}