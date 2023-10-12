package ArrayOperations;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SecondLargestNumberFinderTest {

    @Test
    public void testSecondLargestNumberInString() {
        assertEquals(3, SecondLargestNumberFinder.findSecondLargest("dfa123421afd"));
        assertEquals(-1, SecondLargestNumberFinder.findSecondLargest("abc1111"));
    }
}


