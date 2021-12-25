package com.github.hugovallada.poc.rabbit.controller

import com.github.hugovallada.poc.rabbit.api.PokemonApi
import com.github.hugovallada.poc.rabbit.controller.translator.NewPokemonRequestToDomainTranslator
import com.github.hugovallada.poc.rabbit.controller.translator.PokemonDomainToPokemonResponse
import com.github.hugovallada.poc.rabbit.model.NewPokemonRequest
import com.github.hugovallada.poc.rabbit.model.PokemonResponse
import com.github.hugovallada.poc.rabbit.usecase.CreatePokemonUseCase
import org.jboss.logging.Logger
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class PokemonController(
    private val log: Logger,
    private val createPokemonUseCase: CreatePokemonUseCase
) : PokemonApi{

    override fun createPokemon(newPokemonRequest: NewPokemonRequest): ResponseEntity<PokemonResponse> {
        log.info("Received a request to create a new pokemon named ${newPokemonRequest.name}.")
        val pokemonDomain = createPokemonUseCase.execute(NewPokemonRequestToDomainTranslator.translate(newPokemonRequest)).run {
            createPokemonUseCase.execute(this)
        }
        return ResponseEntity.status(201).body(PokemonDomainToPokemonResponse.translate(pokemonDomain))
    }

    override fun updatePokemon(id: UUID): ResponseEntity<*> {
        TODO("Not yet implemented")
    }

    override fun deletePokemon(id: UUID): ResponseEntity<*> {
        TODO("Not yet implemented")
    }
}