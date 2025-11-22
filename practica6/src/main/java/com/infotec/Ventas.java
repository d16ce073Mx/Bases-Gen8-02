package com.infotec;
import java.util.List;

public class Ventas {
    private int numeroVenta;
    private Cliente cliente;
    private List<Productos> productos;

    

    public Ventas(int numeroVenta, Cliente cliente, List<Productos> productos) {
        this.numeroVenta = numeroVenta;
        this.cliente = cliente;
        this.productos = productos;
    }
    public int getNumeroVenta() {
        return numeroVenta;
    }
    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Productos> getProductos() {
        return productos;
    }
    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    

}
