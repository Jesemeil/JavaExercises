package ArrayOperations;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NonDuplicateElementFinderTest {

    @Test
    public void testFindNonDuplicateElement() {
        int[] input1 = {2, 2, 1};
        int[] input2 = {4, 3, 2, 2, 3, 3};
        int[] input3 = {1};

        assertEquals(1, NonDuplicateElementFinder.findNonDuplicateElement(input1));
        assertEquals(4, NonDuplicateElementFinder.findNonDuplicateElement(input2));
        assertEquals(1, NonDuplicateElementFinder.findNonDuplicateElement(input3));
    }
}

