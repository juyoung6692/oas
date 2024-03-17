package com.example.oas.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @PostMapping("/users")
    fun hi() = "HI"
}