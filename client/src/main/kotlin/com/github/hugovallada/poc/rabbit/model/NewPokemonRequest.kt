package com.github.hugovallada.poc.rabbit.model

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class NewPokemonRequest(
    @field:NotBlank
    val name: String,
    @field:NotBlank
    val attribute: String,
    @field:NotNull
    val powers: Map<String, String>
)
