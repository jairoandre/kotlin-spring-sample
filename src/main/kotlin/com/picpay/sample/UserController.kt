package com.picpay.sample

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import java.util.concurrent.atomic.AtomicLong


@RestController
class UserController {
    val counter = AtomicLong()

    @RequestMapping("/user")
    fun user(@RequestParam(value = "name", defaultValue = "Jairo") name: String): User {
        return User(counter.incrementAndGet(), "Hello, $name")
    }
}
