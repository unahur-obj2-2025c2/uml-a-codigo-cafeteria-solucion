package ar.edu.unahur.obj2.composite.consumibles.bebibles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BebibleTest {
    
    @Test
    void testGetCapacidadMl() {
        Integer capacidadEnMililitros = 250;
        Bebible jugo = new JugoDeNaranja("Jugo de Naranja", 1000.0, capacidadEnMililitros);
        assertEquals(capacidadEnMililitros, jugo.getCapacidadMl());
    }

    @Test
    void testCostoCafeConLeche() {
        Double precioBase = 3000.0;
        Integer capacidad = 250;
        Double valorTipo = 8.0;
        Bebible cafeConLeche = new Cafe("Cafe", precioBase, capacidad, Boolean.TRUE);
        Double valorEsperado = Double.min(precioBase, capacidad * valorTipo);
        assertEquals(valorEsperado, cafeConLeche.costo());
    }

    @Test
    void testCostoCafeSinLeche() {
        Double precioBase = 3000.0;
        Integer capacidad = 250;
        Double valorTipo = 4.0;
        Bebible cafe = new Cafe("Cafe", precioBase, capacidad, Boolean.FALSE);
        Double valorEsperado = Double.min(precioBase, capacidad * valorTipo);
        assertEquals(valorEsperado, cafe.costo());
    }

    @Test
    void testCostoCafeDevuelvePrecioBase() {
        Double precioBase = 500.0;
        Integer capacidad = 250;
        Double valorTipo = 4.0;
        Bebible cafe = new Cafe("Cafe", precioBase, capacidad, Boolean.FALSE);
        Double valorEsperado = Double.min(precioBase, capacidad * valorTipo);
        assertEquals(valorEsperado, cafe.costo());
    }

    @Test
    void testCostoJugoDeNaranja() {
        Double precioBase = 3000.0;
        Integer capacidad = 350;
        Double valorTipo = 6.0;
        Bebible jugo = new JugoDeNaranja("Jugo de Naranja", precioBase, capacidad);
        Double valorEsperado = Double.min(precioBase, capacidad * valorTipo);
        assertEquals(valorEsperado, jugo.costo());
    }

}
