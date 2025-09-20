package ar.edu.unahur.obj2.composite.consumibles.comestibles.medialunas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MedialunaTest {

    @Test
    void testGetTipo() {
        Medialuna medialunaDeManteca = new Medialuna("Medialuna de manteca", 1000.0, 200, TipoMedialuna.DE_MANTECA);
        TipoMedialuna valorEsperado = TipoMedialuna.DE_MANTECA;
        assertEquals(valorEsperado, medialunaDeManteca.getTipo());
    }
    
}
