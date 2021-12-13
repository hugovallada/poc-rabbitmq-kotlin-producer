package com.github.hugovallada.poc.rabbit.api

import com.github.hugovallada.poc.rabbit.model.NewPokemonRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RequestMapping("/pokemons")
interface PokemonApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createPokemon(@Valid @RequestBody newPokemonRequest: NewPokemonRequest) : ResponseEntity<Void>

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun updatePokemon(@PathVariable("id") id: UUID) : ResponseEntity<*>

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletePokemon(@PathVariable("id") id: UUID) : ResponseEntity<*>
}