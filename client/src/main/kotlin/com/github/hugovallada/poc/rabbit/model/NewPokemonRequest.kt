package com.github.hugovallada.poc.rabbit.model

import com.github.hugovallada.poc.rabbit.Power
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class NewPokemonRequest(
    @field:NotBlank
    val name: String,
    @field:NotBlank
    val attribute: String,
    @field:NotNull
    val powers: Power
)
