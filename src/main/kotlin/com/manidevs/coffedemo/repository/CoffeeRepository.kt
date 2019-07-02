package com.manidevs.coffedemo.repository

import com.manidevs.coffedemo.model.Coffee
import org.springframework.data.jpa.repository.JpaRepository

interface CoffeeRepository : JpaRepository<Coffee, Int>{

     fun findByName(name: String): Coffee
     fun findByType(type: String): List<Coffee>

}

