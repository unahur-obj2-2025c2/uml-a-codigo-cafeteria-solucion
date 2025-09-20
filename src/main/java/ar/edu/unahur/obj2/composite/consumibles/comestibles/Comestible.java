package ar.edu.unahur.obj2.composite.consumibles.comestibles;

import ar.edu.unahur.obj2.composite.consumibles.Producto;

public abstract class Comestible extends Producto{

    protected final Integer pesoGr;

    public Comestible(String nombre, Double precioBase, Integer pesoGr) {
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }

    public Integer getPesoGr(){
        return pesoGr;
    }

    @Override
    public Double costo(){
        return super.costo() + pesoGr * doCosto();
    }

    public abstract Double doCosto();

}
