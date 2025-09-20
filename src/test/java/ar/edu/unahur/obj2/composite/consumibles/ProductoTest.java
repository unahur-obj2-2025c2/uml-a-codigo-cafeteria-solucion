package ar.edu.unahur.obj2.composite.consumibles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.consumibles.bebibles.Cafe;

public class ProductoTest {

    private Producto cafe;

    @BeforeEach
    void setUp() {
        cafe = new Cafe("Cafe", 1000.0, 250, Boolean.FALSE);
    }

    @Test
    void testGetNombre() {
        assertEquals("Cafe", cafe.getNombre());
    }

    @Test
    void testGetPrecioBase() {
        assertEquals(1000.0, cafe.getPrecioBase());
    }

    @Test
    void testSetPrecioBase() {
        cafe.setPrecioBase(1200.0);
        assertEquals(1200.0, cafe.getPrecioBase());
    }
    
}
