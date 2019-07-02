package com.manidevs.coffedemo.service

import com.manidevs.coffedemo.model.Coffee
import com.manidevs.coffedemo.repository.CoffeeRepository
import com.manidevs.coffedemo.repository.UserRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class CoffeeService {

    @Autowired
    lateinit var coffeeRepository: CoffeeRepository
    @Autowired
    lateinit var userRepository: UserRepository

    @Value(value = "\${topic.coffee}")
    var topic: String? = null

    private val GET = "GET"
    private val POST = "POST"
    private val PUT = "PUT"
    private val DELETE = "DELETE"

    /**
     * @param coffee
     * @return
     */
    fun addCoffee(coffee: Coffee): Coffee {
        return coffeeRepository.save(coffee)
    }
    /**
     *
     * @param id
     * @return
     */
    fun getCoffee(id: Int?): Coffee {
        val coffee = coffeeRepository.findById(id!!)
        return coffee.get()
    }

    /**
     * @param coffee
     * @return
     */
    fun updateCoffee(coffee: Coffee): Coffee {
        val coffeeOptional = coffeeRepository.findById(coffee.id)
        var coffeeToUpdate = coffeeOptional.get()
        val modelMapper : ModelMapper = ModelMapper()
        coffeeToUpdate = modelMapper.map(coffee, Coffee::class.java)
        return coffeeRepository.save(coffeeToUpdate)
    }

    /**
     * @param id
     */
    fun deleteCoffee(id: Int){
        coffeeRepository.deleteById(id)
    }

    /**
     * @return
     */
    fun getAllCoffees(): List<Coffee> {
        val listCoffees = coffeeRepository.findAll()
        return listCoffees
    }

    /**
     * @param name
     * @return
     */
    fun getCoffeebyName(name: String ): Coffee {
        val coffeeList : List<Coffee> = coffeeRepository.findAll()
        val coffeByName : Coffee = coffeeList.stream().filter { coffee -> name == coffee.name }.findFirst().get()
        return coffeByName
    }

    /**
     *
     * @param type
     * @return
     */
    fun getCoffeesByType(type: String): List<Coffee>{
        val coffeesByTypes = coffeeRepository.findByType(type)
        return coffeesByTypes
    }


}