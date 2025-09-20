package ar.edu.unahur.obj2.composite.consumibles.bebibles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CafeTest {

    @Test
    void testGetConLeche() {
        Boolean valorEsperado = Boolean.FALSE;
        Cafe cafe = new Cafe("Cafe", 1000.0, 250, valorEsperado);
        assertEquals(valorEsperado, cafe.getConLeche());
    }
    
}
