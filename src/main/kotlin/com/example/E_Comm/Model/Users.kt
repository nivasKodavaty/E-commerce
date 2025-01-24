package com.example.E_Comm.Model

import jakarta.persistence.*


@Entity
@Table(name = "users")
data class Users(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, unique = true)
    val username: String,

    @Column(nullable = false)
    var password: String,

    @Column(nullable = false)
    val role: String
) {
    constructor(username: String, password: String) : this(
        id = null,
        username = username,
        password = password,
        role = "USER"
    )
}
