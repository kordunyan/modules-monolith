package com.modules.module.shop.modules.user

import com.modules.module.shop.modules.user.command.result.UserDetailsResult
import org.springframework.stereotype.Service

@Service
class UserService {

    fun getUserDetails(id: Long) : UserDetailsResult {
        return UserDetailsResult(
            userName = "John Doe",
            email = "user@mail.com"
        )
    }
}