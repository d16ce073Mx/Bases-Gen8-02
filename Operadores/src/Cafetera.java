public class Cafetera {
    private int porcentajeAgua;
    private int capacidadTazas;
    private int CucharadasCafe;
    private boolean status;
    

    public Cafetera(int capacidadTazas) {
        this.capacidadTazas = capacidadTazas;
    }


    public Cafetera(int porcentajeAgua, int capacidadTazas, int cucharadasCafe, boolean status) {
        this.porcentajeAgua = porcentajeAgua;
        this.capacidadTazas = capacidadTazas;
        CucharadasCafe = cucharadasCafe;
        this.status = status;
    }



    
}
