package com.tritech.f1backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    //Processo in cui un oggetto definisce le sue dipendenze senza crearle.
    //Un bean è un oggetto che viene istanziato, assemblato e altrimenti gestito da un container Spring IoC
    @Bean
    public WebMvcConfigurer corsConfigurer(){ //il metodo ritorna l'oggetto WebMvcConfigure
        return new WebMvcConfigurer() { //creo l'oggetto WebMvcConfigure

            @Override
            public void addCorsMappings(CorsRegistry registry){ //questo metodo accetta l'oggetto CorsRegistry
                //definisco quali endpoint accetteranno la richiesta dagli altri domini
                //In questo caso ("/**") abilito il cors su ogni endpoint
                registry.addMapping("/**")
                        //definisco quali metodi HTTP saranno accetati
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        //definisco che accetteremo tutte le intestazioni
                        .allowedHeaders("*")
                        //definisco da quale origine voglio accettare le richieste
                        .allowedOrigins("http://localhost:4200");
            }
        };
    }
}
