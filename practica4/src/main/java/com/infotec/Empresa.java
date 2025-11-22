package com.infotec;

public class Empresa {
    private String Nombre;
    private String razonSocial;
    private String RFC;
    private Domicilio domicilio;

    

    public Empresa() {
    }

    

    public Empresa(String nombre, String razonSocial, String rFC, Domicilio domicilio) {
        Nombre = nombre;
        this.razonSocial = razonSocial;
        RFC = rFC;
        this.domicilio = domicilio;
    }



    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getRFC() {
        return RFC;
    }
    public void setRFC(String rFC) {
        RFC = rFC;
    }
    public Domicilio getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    } 

    


}
