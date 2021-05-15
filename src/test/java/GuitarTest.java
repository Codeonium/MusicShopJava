import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("wown", 150);
    }

    @Test
    public void hasSound() {
        assertEquals("wown", guitar.getSound());
    }

    @Test
    public void hasPrice() {
        assertEquals(150, guitar.getPrice());
    }
    @Test
    public void implementedWorks() {
        assertEquals("wown123", guitar.play("wown123"));
    }
}
