package com.example.mycomposeapplication.data.food

import java.math.BigDecimal
import java.util.*

data class Snack ( // по идее нужно объединить с кофе, потому что одно и то же
    val id: UUID,
    val name: String,
    val imageId: String,
    val description: String,
    val price: BigDecimal,
    val categoryId: CategoryId
    )