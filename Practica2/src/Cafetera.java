public class Cafetera {
    private int porcentajeAgua;
    private int capacidadTazas;
    private int CucharadasCafe;
    private boolean status;
    

    public Cafetera(int capacidadTazas) {
        this.capacidadTazas = capacidadTazas;
    }

    
    
   
    public int getPorcentajeAgua() {
        return porcentajeAgua;
    }



    public void setPorcentajeAgua(int porcentajeAgua) {
        this.porcentajeAgua = porcentajeAgua;
    }



    public int getCapacidadTazas() {
        return capacidadTazas;
    }


    public int getCucharadasCafe() {
        return CucharadasCafe;
    }



    public void setCucharadasCafe(int cucharadasCafe) {
        CucharadasCafe = cucharadasCafe;
    }



    public boolean isStatus() {
        return status;
    }



    public void setStatus(boolean status) {
        this.status = status;
    }


    
    
}
