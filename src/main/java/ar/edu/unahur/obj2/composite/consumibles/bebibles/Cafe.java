package ar.edu.unahur.obj2.composite.consumibles.bebibles;

public class Cafe extends Bebible{

    private final Boolean conLeche;

    public Cafe(String nombre, Double precioBase, Integer capacidadMl, Boolean conLeche) {
        super(nombre, precioBase, capacidadMl);
        this.conLeche = conLeche;
    }

    public Boolean getConLeche(){
        return conLeche;
    }

    @Override
    public Double doCosto() {
       return conLeche ? 8.0 : 4.0;
    }

}
