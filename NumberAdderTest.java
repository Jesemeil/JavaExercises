package ArrayOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberAdderTest {

    @Test
    public void testThatItAddsOnlyTheNumbers() {
        String input = "A12B-9CKdt59";
        int expected = 26;
        int actual = NumberAdder.addNumbers(input);
        assertEquals(expected, actual);
    }
}
