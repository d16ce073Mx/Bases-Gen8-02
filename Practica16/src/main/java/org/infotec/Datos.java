package org.infotec;

import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import org.springframework.stereotype.Component;


@Singleton
@Startup
@Component
public class Datos {
    private final String [] G02 ={"Juan", "Claudia", "Karina", "Plutarco", "Hildebardo", "Pedro", "Cristobal", "Eleazer"};
    private int i = 0;
    public String enviarDatos(){
        String value = G02[i];
        System.out.println("Datos: "+value);
        i++;
        if (i == G02.length)
            i= 0;
        return value;
    }

}
