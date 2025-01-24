package com.example.E_Comm.Controllers

import com.example.E_Comm.Model.Users
import com.example.E_Comm.Service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class UserController(
    private val userService: UserService
) {
    @PostMapping("/save")
    fun saveUser(@RequestBody users: Users): ResponseEntity<Users> {
        println(users.username)
        val savedUser = userService.saveUser(users)
        return ResponseEntity.ok(savedUser)
    }
}

