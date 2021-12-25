package com.github.hugovallada.poc.rabbit.gateway.database.translator

import com.github.hugovallada.poc.rabbit.domain.PokemonDomain
import com.github.hugovallada.poc.rabbit.gateway.database.model.PokemonModel

object PokemonModelToDomainTranslator {

    fun translate(model: PokemonModel) = PokemonDomain(
        name = model.name, attribute = model.attribute, power = model.power, createdAt = model.createdAt,
        updatedAt = model.updatedAt, id = model.id
    )

}