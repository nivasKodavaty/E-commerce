package com.example.E_Comm.Repositories

import com.example.E_Comm.Model.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepository : JpaRepository<Users , Long>
{
    fun findByUsername(username: String?): Users?
}