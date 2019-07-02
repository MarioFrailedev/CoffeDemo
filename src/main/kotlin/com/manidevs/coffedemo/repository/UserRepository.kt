package com.manidevs.coffedemo.repository

import com.manidevs.coffedemo.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int>