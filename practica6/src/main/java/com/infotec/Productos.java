package com.infotec;

public class Productos {
    private String nombreProducto;
    private Categoria categoria;
    private int stock;
    private double precio;

    public Productos(String nombreProducto, Categoria categoria, int stock, double precio) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

}
