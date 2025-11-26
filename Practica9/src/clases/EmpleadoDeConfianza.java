package clases;

public class EmpleadoDeConfianza extends Persona implements Empleado {
    private String puesto;
    private String Dependencia;
    private String Area;
    private double sueldo;

    public EmpleadoDeConfianza(String nombre, int edad, String puesto, String dependencia, String area, double sueldo) {
        super(nombre, edad);
        this.puesto = puesto;
        Dependencia = dependencia;
        Area = area;
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDependencia() {
        return Dependencia;
    }

    public void setDependencia(String dependencia) {
        Dependencia = dependencia;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldo;
    }

    @Override
    public void info() {
        System.out.println("EmpleadoDeConfianza{" +
                "puesto='" + puesto + '\'' +
                ", Dependencia='" + Dependencia + '\'' +
                ", Area='" + Area + '\'' +
                ", sueldo=" + sueldo +
                '}');
    }
}
