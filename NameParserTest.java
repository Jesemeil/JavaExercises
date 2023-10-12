package ArrayOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameParserTest {
    @Test
    public void testThatItGivesTheInitials() {
        String input = "James Akpan Tinu Ugochukwu";
        String expected = "J. A. Ugochukwu";
        String actual = NameParser.parseName(input);
        assertEquals(expected, actual);
    }

}

