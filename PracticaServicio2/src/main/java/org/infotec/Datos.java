package org.infotec;
import jakarta.ejb.LockType;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import org.springframework.stereotype.Component;

@Singleton
@Startup
@Component
public class Datos {
    private final String[] students = {"Juan", "Karina", "Claudia", "José", "Javier","Pedro", "Roberto"};
    private int i = 0;


    public String enviarDatos() {
        String value = students[i];
        i++;
        if (i == students.length)
            i = 0;
        return value;
    }
}
