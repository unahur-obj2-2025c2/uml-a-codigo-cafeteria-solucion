package ar.edu.unahur.obj2.composite.consumibles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.consumibles.bebibles.Bebible;
import ar.edu.unahur.obj2.composite.consumibles.bebibles.JugoDeNaranja;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.Comestible;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.tostados.TipoTostado;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.tostados.Tostado;

public class ComboTest {

    @Test
    void testEliminarProducto() {
        Bebible jugo = new JugoDeNaranja("Jugo de naranja", 1000.0, 200);
        Comestible tostadoDeJYQ = new Tostado("Tostado de Jamon y Queso", 1500.0, 150, TipoTostado.JAMON_Y_QUESO);
        Combo desayuno = new Combo("Desayuno", 5000.0);
        desayuno.agregarProducto(jugo);
        desayuno.agregarProducto(tostadoDeJYQ);
        desayuno.eliminarProducto(jugo);
        List<Consumible> productosEsperados = List.of(tostadoDeJYQ);
        assertEquals(productosEsperados, desayuno.getProductos());
    }

    @Test
    void testGetNombre() {
        Combo desayuno = new Combo("Desayuno", 5000.0);
        assertEquals("Desayuno", desayuno.getNombre());
    }

    @Test
    void testGetPrecio() {
        Combo desayuno = new Combo("Desayuno", 5000.0);
        assertEquals(5000.0, desayuno.getPrecio());
    }

}
