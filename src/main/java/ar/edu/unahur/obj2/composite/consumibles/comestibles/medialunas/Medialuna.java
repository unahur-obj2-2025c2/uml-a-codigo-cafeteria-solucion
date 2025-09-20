package ar.edu.unahur.obj2.composite.consumibles.comestibles.medialunas;

import ar.edu.unahur.obj2.composite.consumibles.comestibles.Comestible;

public class Medialuna extends Comestible{

    private final TipoMedialuna tipo;

    public Medialuna(String nombre, Double precioBase, Integer pesoGr, TipoMedialuna tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    public TipoMedialuna getTipo(){
        return tipo;
    }

    @Override
    public Double doCosto() {
        return switch(tipo){
            case TipoMedialuna.DE_MANTECA -> 2.5;
            case TipoMedialuna.DE_GRASA -> 1.25;
            case TipoMedialuna.CON_DULCE_DE_LECHE -> 3.25;
        };
    }

}
