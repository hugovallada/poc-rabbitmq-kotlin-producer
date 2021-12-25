package com.github.hugovallada.poc.rabbit.controller.translator

import com.github.hugovallada.poc.rabbit.domain.PokemonDomain
import com.github.hugovallada.poc.rabbit.model.NewPokemonRequest

object NewPokemonRequestToDomainTranslator {

    fun translate(pokemonRequest: NewPokemonRequest) = PokemonDomain(
        name = pokemonRequest.name, attribute = pokemonRequest.attribute, power = pokemonRequest.powers
    )

}