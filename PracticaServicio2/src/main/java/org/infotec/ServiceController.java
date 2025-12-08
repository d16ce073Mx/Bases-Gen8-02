package org.infotec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @RestController
    @Configuration
    public class ServiceController {

        @Autowired
        private  Datos datos;




        @PostConstruct
        public void initialize() {
            System.out.println("Singleton Inicializado");
        }


        @GetMapping("/enviar")
        public String enviarDatos() {

            System.out.println("Singleton Enviando datos"+datos.enviarDatos());
            return datos.enviarDatos();
        }


        @PreDestroy
        public void cleanup() {
            System.out.println("Singleton terminando");
        }

    }
