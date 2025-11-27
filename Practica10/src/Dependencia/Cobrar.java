package Dependencia;

public class Cobrar {
    private int total=0;

    public void recibirPago(Dinero dinero){
        total = total + dinero.valor();
        System.out.println("Estoy recibiendo billete de "+ dinero.valor());
        System.out.println("El total es,"+ total);

    }

    public int getTotal(){
        return this.total;
    }
}
