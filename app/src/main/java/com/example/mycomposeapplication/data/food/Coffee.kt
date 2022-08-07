package com.example.mycomposeapplication.data.food

import java.math.BigDecimal
import java.util.*

data class Coffee(
    val id: UUID,
    val name: String,
    val imageId: String,
    val price: BigDecimal,
    val description: String,
    val categoryId: CategoryId
)