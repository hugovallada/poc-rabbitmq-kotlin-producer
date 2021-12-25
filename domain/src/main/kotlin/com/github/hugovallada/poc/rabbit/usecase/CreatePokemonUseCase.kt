package com.github.hugovallada.poc.rabbit.usecase

import com.github.hugovallada.poc.rabbit.domain.PokemonDomain
import com.github.hugovallada.poc.rabbit.gateway.database.CreatePokemonGateway
import org.springframework.stereotype.Component

@Component
class CreatePokemonUseCase(private val gateway: CreatePokemonGateway) {

    fun execute(pokemon: PokemonDomain): PokemonDomain {
        return gateway.execute(pokemon)
    }

}