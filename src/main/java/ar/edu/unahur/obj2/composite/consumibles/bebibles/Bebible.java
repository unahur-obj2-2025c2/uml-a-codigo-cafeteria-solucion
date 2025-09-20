package ar.edu.unahur.obj2.composite.consumibles.bebibles;

import ar.edu.unahur.obj2.composite.consumibles.Producto;

public abstract class Bebible extends Producto{

    protected final Integer capacidadMl;

    public Bebible(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase);
        this.capacidadMl = capacidadMl;
    }

    public Integer getCapacidadMl(){
        return capacidadMl;
    }

    @Override
    public Double costo(){
        return Double.min(super.costo(), capacidadMl * doCosto());
    }

    public abstract Double doCosto();

}
