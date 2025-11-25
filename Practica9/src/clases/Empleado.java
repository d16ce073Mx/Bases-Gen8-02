package clases;

public class Empleado extends Persona {
    private String RFC;

    public Empleado(String nombre, int edad, String RFC) {
        super(nombre, edad);
        this.RFC = RFC;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }


    @Override
    public void info() {
        System.out.println("Abstracto *+ Persona: "+this.getNombre());
        System.out.println("Abstracto *+ Persona: "+this.getEdad());
        System.out.println("Abstracto *+ sEmpleado: "+this.getRFC());
    }
}
