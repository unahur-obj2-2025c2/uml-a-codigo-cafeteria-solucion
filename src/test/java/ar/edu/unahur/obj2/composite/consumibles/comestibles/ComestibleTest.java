package ar.edu.unahur.obj2.composite.consumibles.comestibles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.consumibles.comestibles.medialunas.Medialuna;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.medialunas.TipoMedialuna;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.tostados.TipoTostado;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.tostados.Tostado;

public class ComestibleTest {

    @Test
    void testPesoGramos() {
        Integer peso = 250;
        Comestible tostadoJYQ = new Tostado("Tostado de jamon y queso", 100.0, peso, TipoTostado.JAMON_Y_QUESO);;
        assertEquals(peso, tostadoJYQ.getPesoGr());
    }

    @Test
    void testCostoTostadoJamonYQueso() {
        Double precioBase = 1500.0;
        Integer peso = 250;
        Double valorTipo = 2.0;
        Comestible tostadoJYQ = new Tostado("Tostado de jamon y queso", precioBase, peso, TipoTostado.JAMON_Y_QUESO);
        Double valorEsperado = precioBase + peso * valorTipo;
        assertEquals(valorEsperado, tostadoJYQ.costo());
    }

    @Test
    void testCostoTostadoSalameYQueso() {
        Double precioBase = 2000.0;
        Integer peso = 300;
        Double valorTipo = 5.0;
        Comestible tostadoSYQ = new Tostado("Tostado de salame y queso", precioBase, peso, TipoTostado.SALAME_Y_QUESO);
        Double valorEsperado = precioBase + peso * valorTipo;
        assertEquals(valorEsperado, tostadoSYQ.costo());
    }

    @Test
    void testCostoMedialunaDeManteca() {
        Double precioBase = 1000.0;
        Integer peso = 200;
        Double valorTipo = 2.5;
        Comestible medialunaDeManteca = new Medialuna("Medialuna de manteca", precioBase, peso, TipoMedialuna.DE_MANTECA);
        Double valorEsperado = precioBase + peso * valorTipo;
        assertEquals(valorEsperado, medialunaDeManteca.costo());
    }

    @Test
    void testCostoMedialunaDeGrasa() {
        Double precioBase = 1100.0;
        Integer peso = 250;
        Double valorTipo = 1.25;
        Comestible medialunaDeGrasa = new Medialuna("Medialuna de grasa", precioBase, peso, TipoMedialuna.DE_GRASA);
        Double valorEsperado = precioBase + peso * valorTipo;
        assertEquals(valorEsperado, medialunaDeGrasa.costo());
    }

    @Test
    void testCostoMedialunaConDulceDeLeche() {
        Double precioBase = 1200.0;
        Integer peso = 300;
        Double valorTipo = 3.25;
        Comestible medialunaConDulceDeLeche = new Medialuna("Medialuna con dulce de leche", precioBase, peso, TipoMedialuna.CON_DULCE_DE_LECHE);
        Double valorEsperado = precioBase + peso * valorTipo;
        assertEquals(valorEsperado, medialunaConDulceDeLeche.costo());
    }

}
