package com.github.hugovallada.poc.rabbit.controller.translator

import com.github.hugovallada.poc.rabbit.domain.PokemonDomain
import com.github.hugovallada.poc.rabbit.model.PokemonResponse

object PokemonDomainToPokemonResponse {

    fun translate(pokemon: PokemonDomain) = PokemonResponse(
        name = pokemon.name, attribute = pokemon.attribute, powers = pokemon.power,
        createdAt = pokemon.createdAt!!, updatedAt = pokemon.updatedAt!!, id = pokemon.id!!
    )

}