package com.github.hugovallada.poc.rabbit.model

import com.github.hugovallada.poc.rabbit.Power
import java.time.OffsetDateTime

data class PokemonResponse(
    val id: Long,
    val name: String,
    val attribute: String,
    val powers: Power,
    val createdAt: OffsetDateTime,
    val updatedAt: OffsetDateTime
)
