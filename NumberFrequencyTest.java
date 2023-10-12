package ArrayOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFrequencyTest {
    @Test
    public void testMostFrequentNumber() {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        int expectedNumber1 = 3;
        int actualNumber1 = NumberFrequency.findMostFrequentNumber(nums1);

        int expectedNumber2 = 2;
        int actualNumber2 = NumberFrequency.findMostFrequentNumber(nums2);

        assertEquals(expectedNumber1, actualNumber1);
        assertEquals(expectedNumber2, actualNumber2);
    }
}

