package com.example.springpractice

import org.springframework.web.bind.annotation.*


data class ViewAccount(
    val id: Int,
    val name: String
)

data class CreateAccount(
    val name: String
)

@RestController
@RequestMapping("/accounts")
class AccountsController {

    @GetMapping("/")
    fun getAll(): Iterable<ViewAccount> =
        listOf(ViewAccount(id = 1, name = "Fatiq Hussnian"))

    @PostMapping("/")
    fun create(@RequestBody request: CreateAccount): ViewAccount =
        ViewAccount(id = 2, name = request.name)
}