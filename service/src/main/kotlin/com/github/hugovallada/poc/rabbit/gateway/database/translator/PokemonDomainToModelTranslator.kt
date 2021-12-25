package com.github.hugovallada.poc.rabbit.gateway.database.translator

import com.github.hugovallada.poc.rabbit.domain.PokemonDomain
import com.github.hugovallada.poc.rabbit.gateway.database.model.PokemonModel

object PokemonDomainToModelTranslator {

    fun translate(pokemonDomain: PokemonDomain) = PokemonModel(
        name = pokemonDomain.name, attribute = pokemonDomain.attribute, power = pokemonDomain.power
    )

}