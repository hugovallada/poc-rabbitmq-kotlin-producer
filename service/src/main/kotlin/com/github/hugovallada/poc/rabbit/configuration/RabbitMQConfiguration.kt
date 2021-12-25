package com.github.hugovallada.poc.rabbit.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import org.springframework.amqp.core.FanoutExchange
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConfiguration(
    val cachingConnectionFactory: CachingConnectionFactory
) {
    @Value("\${poc.broker.exchange.pokemonEventExchange}")
    private val exchange: String? = null

    @Bean
    fun rabbitTemplate() : RabbitTemplate {
        val rabbitTemplate = RabbitTemplate(cachingConnectionFactory)
        rabbitTemplate.messageConverter = messageConverter()
        return rabbitTemplate
    }

    @Bean
    fun messageConverter(): Jackson2JsonMessageConverter {
        val mapper = ObjectMapper()
        mapper.registerModule(JavaTimeModule())
        return Jackson2JsonMessageConverter(mapper)
    }

    @Bean
    fun fanoutExchange() : FanoutExchange {
        return FanoutExchange(exchange)
    }
}