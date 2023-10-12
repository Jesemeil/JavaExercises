package ArrayOperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstOrderIsogramTest {

    private FirstOrderIsogram isogramChecker;

    @BeforeEach
    public void setUp() {
        isogramChecker = new FirstOrderIsogram();
    }

    @Test
    public void testEmptyString() {
        assertFalse(isogramChecker.isFirstOrderIsogram(""));
    }

    @Test
    public void testNullString() {
        assertFalse(isogramChecker.isFirstOrderIsogram(null));
    }

    @Test
    public void testIsogramText() {
        assertTrue(isogramChecker.isFirstOrderIsogram("abcdefghi99987675646454 jklmnopqrstuvwxyz"));
        assertFalse(isogramChecker.isFirstOrderIsogram("T0he qick bywn fx jumps ovr a7 lazy dg"));
    }

    @Test
    public void testNonIsogramText() {
        assertFalse(isogramChecker.isFirstOrderIsogram("hello world"));
        assertFalse(isogramChecker.isFirstOrderIsogram("abcdefghijklmnopqrstuvwxy"));
        assertFalse(isogramChecker.isFirstOrderIsogram("ABACABA"));
    }

    @Test
    public void testCaseInsensitiveIsogram() {
        assertTrue(isogramChecker.isFirstOrderIsogram("AbCdEfGhIjKlMnOpQrStUvWxYz"));
    }
}
