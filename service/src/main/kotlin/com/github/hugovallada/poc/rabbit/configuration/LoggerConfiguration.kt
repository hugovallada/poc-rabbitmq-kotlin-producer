package com.github.hugovallada.poc.rabbit.configuration

import org.jboss.logging.Logger
import org.springframework.beans.factory.InjectionPoint
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope

@Configuration
class LoggerConfiguration {

    // only accepts constructor injection
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    fun logger(injectionPoint: InjectionPoint) : Logger {
        return Logger.getLogger(injectionPoint.methodParameter?.containingClass)
    }

// Example that allows field and constructor injection
//    @Bean
//    @Scope("prototype")
//    fun logger(injectionPoint: InjectionPoint) : Logger {
//        return Logger.getLogger(
//            injectionPoint.methodParameter?.containingClass
//                ?:
//            injectionPoint.field?.declaringClass
//        )
//    }

}