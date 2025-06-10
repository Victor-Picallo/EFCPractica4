import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class BuscadorTest {
    @Test
    void testContienePalabraClave() {
        Buscador busc = new Buscador();
        boolean r = busc.contienePalabraClave("Estoy aprendiendo Java y me encanta.");
        assertTrue(r);
    }

     @Test
    void testNoContienePalabraClave() {
        Buscador busc = new Buscador();
        boolean r = busc.contienePalabraClave("Este texto no contiene la palabra clave.");
        assertFalse(r);
    }
}
