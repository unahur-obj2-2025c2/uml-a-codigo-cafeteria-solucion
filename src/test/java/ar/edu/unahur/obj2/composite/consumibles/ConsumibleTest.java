package ar.edu.unahur.obj2.composite.consumibles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.consumibles.bebibles.Bebible;
import ar.edu.unahur.obj2.composite.consumibles.bebibles.Cafe;
import ar.edu.unahur.obj2.composite.consumibles.bebibles.JugoDeNaranja;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.Comestible;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.medialunas.Medialuna;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.medialunas.TipoMedialuna;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.tostados.TipoTostado;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.tostados.Tostado;

public class ConsumibleTest {

    @Test
    void testCostoCombo() {
        Bebible cafeConLeche = new Cafe("Café con leche", 1000.0, 200, Boolean.TRUE);
        Comestible medialunaDeManteca = new Medialuna("Medialuna", 500.0, 100, TipoMedialuna.DE_MANTECA);
        Comestible medialunaDeGrasa = new Medialuna("Medialuna", 400.0, 80, TipoMedialuna.DE_GRASA);
        List<Consumible> productos = List.of(cafeConLeche, medialunaDeManteca, medialunaDeGrasa);
        Combo desayuno = new Combo("Desayuno", 1000.0, productos);
        assertEquals(1000.0, desayuno.costo());

    }

    @Test
    void testCostoComboSumandoPrecioDeProductos() {
        Bebible jugo = new JugoDeNaranja("Jugo de naranja", 1000.0, 200); //minimo entre 1000 y 200 * 6 = 1200 es 1000
        Comestible tostadoDeJYQ = new Tostado("Tostado de Jamon y Queso", 1500.0, 150, TipoTostado.JAMON_Y_QUESO); //1500 + 150 * 2 = 1800
        Combo desayuno = new Combo("Desayuno", 5000.0);
        desayuno.agregarProducto(jugo);
        desayuno.agregarProducto(tostadoDeJYQ);
        assertEquals(2800.0, desayuno.costo());
    }

}
