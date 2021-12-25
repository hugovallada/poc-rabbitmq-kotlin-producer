package com.github.hugovallada.poc.rabbit.gateway.database.model

import com.github.hugovallada.poc.rabbit.Power
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.OffsetDateTime
import javax.persistence.*

@Entity
@Table(name = "TB_POKEMON")
class PokemonModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String,
    val attribute: String,
    val power: Power,
    @CreationTimestamp
    val createdAt: OffsetDateTime? = null,
    @UpdateTimestamp
    val updatedAt: OffsetDateTime? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PokemonModel

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun toString(): String {
        return "PokemonModel(name='$name', attribute='$attribute', power=$power, createdAt=$createdAt, updatedAt=$updatedAt)"
    }


}