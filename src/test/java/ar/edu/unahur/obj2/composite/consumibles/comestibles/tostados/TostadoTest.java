package ar.edu.unahur.obj2.composite.consumibles.comestibles.tostados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TostadoTest {

    @Test
    void testGetTipo() {
        Tostado tostadoJYQ = new Tostado("Tostado de jamon y queso", 1000.0, 200, TipoTostado.JAMON_Y_QUESO);
        TipoTostado valorEsperado = TipoTostado.JAMON_Y_QUESO;
        assertEquals(valorEsperado, tostadoJYQ.getTipo());
    }
    
}
