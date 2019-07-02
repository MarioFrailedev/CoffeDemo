package com.manidevs.coffedemo.model

import javax.persistence.Id

data class User(@Id val id: Int,
                var name: String? = null,
                var lastName: String? = null,
                var email: String? = null)
