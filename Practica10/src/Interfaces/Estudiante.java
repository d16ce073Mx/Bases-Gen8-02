package Interfaces;

public class Estudiante implements ResponsabilidadesEstudiante{
    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando...");
    }
/*
    @Override
    public void investigar() {
        throw new UnsupportedOperationException("Un estudiante no realiza investigación");
    }

 */
}
