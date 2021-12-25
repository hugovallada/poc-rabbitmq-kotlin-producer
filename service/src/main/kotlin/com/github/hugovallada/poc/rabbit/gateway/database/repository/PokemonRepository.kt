package com.github.hugovallada.poc.rabbit.gateway.database.repository

import com.github.hugovallada.poc.rabbit.gateway.database.model.PokemonModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonRepository : JpaRepository<PokemonModel, Long> {
}