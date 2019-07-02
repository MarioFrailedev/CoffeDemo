package com.manidevs.coffedemo.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/user"])
@CrossOrigin(origins = ["*"], maxAge = 2000, allowedHeaders = ["*"])
class UserController {


    }