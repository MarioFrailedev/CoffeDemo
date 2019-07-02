package com.manidevs.coffedemo.model

import java.lang.reflect.Array.get
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Coffee(@Id val id: Int,
                  val name: String? = null,
                  val type: String? = null,
                  var price: Double? = null)


