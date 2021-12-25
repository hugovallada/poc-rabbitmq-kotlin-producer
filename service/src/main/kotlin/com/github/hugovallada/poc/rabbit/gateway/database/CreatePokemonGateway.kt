package com.github.hugovallada.poc.rabbit.gateway.database

import com.github.hugovallada.poc.rabbit.domain.PokemonDomain

interface CreatePokemonGateway {

    fun execute (pokemon: PokemonDomain) : PokemonDomain

}