package ar.edu.unahur.obj2.composite.consumibles;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Consumible{

    private final String nombre;
    private final Double precio;
    private List<Consumible> productos;

    public Combo(String nombre, Double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.productos = new ArrayList<>();
    }

    public Combo(String nombre, Double precio, List<Consumible> productos){
        this.nombre = nombre;
        this.precio = precio;
        this.productos = productos;
    }

    public String getNombre(){
        return nombre;
    }

    public Double getPrecio(){
        return precio;
    }

    public List<Consumible> getProductos(){
        return productos;
    }

    public void agregarProducto(Consumible producto){
        this.productos.add(producto);
    }

    public void eliminarProducto(Consumible producto){
        this.productos.remove(producto);
    }

    @Override
    public Double costo() {
        return Double.min(precio, productos.stream().mapToDouble(Consumible::costo).sum());
    }

}
