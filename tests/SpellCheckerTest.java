import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpellCheckerTest {
    private SpellChecker spellChecker = new SpellChecker();

    @Test
    public void returnStringTest() {
        assertEquals("Hello", spellChecker.processWord("Hello"));

    }
    @Test
    public void returnMispeltStringTest() {
        assertEquals("~Helpo~", spellChecker.processWord("Helpo"));

    }

}
