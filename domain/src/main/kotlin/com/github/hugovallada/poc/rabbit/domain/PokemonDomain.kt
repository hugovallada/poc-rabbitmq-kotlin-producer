package com.github.hugovallada.poc.rabbit.domain

import com.github.hugovallada.poc.rabbit.Power
import java.time.OffsetDateTime

data class PokemonDomain(
    val id:Long?  = null,
    val name: String,
    val attribute: String,
    val power: Power,
    val createdAt: OffsetDateTime? = null,
    val updatedAt: OffsetDateTime? = null
)
