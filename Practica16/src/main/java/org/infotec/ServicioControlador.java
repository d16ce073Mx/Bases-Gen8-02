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
public class ServicioControlador {

    @Autowired
    private Datos datos;

    @PostConstruct
    private void initialize(){
        System.out.println("Inicializando Singleton");
    }

    @GetMapping("/enviar")
    public String enviarDatos(){
        System.out.println("Enviando datos");
        return datos.enviarDatos();

    }

    @PreDestroy
    private void finalizing(){
        System.out.println("Finalizando Singleton");
    }
}
