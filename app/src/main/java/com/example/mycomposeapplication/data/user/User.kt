package com.example.mycomposeapplication.data.user

import java.util.*

data class User (
    val id: UUID,
    val name: String?,
    val surname: String?,
    val discount: Int // скидка
)