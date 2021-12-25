package com.github.hugovallada.poc.rabbit.gateway.database.impl

import com.github.hugovallada.poc.rabbit.domain.PokemonDomain
import com.github.hugovallada.poc.rabbit.gateway.database.CreatePokemonGateway
import com.github.hugovallada.poc.rabbit.gateway.database.repository.PokemonRepository
import com.github.hugovallada.poc.rabbit.gateway.database.translator.PokemonDomainToModelTranslator
import com.github.hugovallada.poc.rabbit.gateway.database.translator.PokemonModelToDomainTranslator
import org.springframework.stereotype.Component

@Component
class CreatePokemonGatewayImpl (private val repository: PokemonRepository) : CreatePokemonGateway {

    override fun execute(pokemon: PokemonDomain): PokemonDomain {
        PokemonDomainToModelTranslator.translate(pokemon).run {
            repository.save(this)
        }.apply {
            return PokemonModelToDomainTranslator.translate(this)
        }
    }
}