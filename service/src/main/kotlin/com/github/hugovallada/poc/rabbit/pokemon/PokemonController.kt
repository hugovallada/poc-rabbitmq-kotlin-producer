package com.github.hugovallada.poc.rabbit.pokemon

import com.github.hugovallada.poc.rabbit.api.PokemonApi
import com.github.hugovallada.poc.rabbit.model.NewPokemonRequest
import org.jboss.logging.Logger
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class PokemonController(private val log: Logger) : PokemonApi{

    override fun createPokemon(newPokemonRequest: NewPokemonRequest): ResponseEntity<Void> {
        log.info(newPokemonRequest)
        return ResponseEntity.noContent().build()
    }

    override fun updatePokemon(id: UUID): ResponseEntity<*> {
        TODO("Not yet implemented")
    }

    override fun deletePokemon(id: UUID): ResponseEntity<*> {
        TODO("Not yet implemented")
    }
}