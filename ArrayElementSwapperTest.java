package ArrayOperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayElementSwapperTest {

    private ArrayElementSwapper arrayElementSwapper;
    private int[] testArray;

    @BeforeEach
    public void setUp() {
        arrayElementSwapper = new ArrayElementSwapper();
        testArray = new int[]{5, 2, 6, 10, 9, 3};
    }

    @Test
    public void testSwapElementsInArray_PositiveCase() {
        assertArrayEquals(new int[]{5, 2, 6, 10, 9, 3}, testArray);
        arrayElementSwapper.swap(testArray, 2, 4);
        assertArrayEquals(new int[]{5, 2, 9, 10, 6, 3}, testArray);
    }

    @Test
    public void testSwapElementsInArray_InvalidIndices() {
        assertArrayEquals(new int[]{5, 2, 6, 10, 9, 3}, testArray);
        assertThrows(IllegalArgumentException.class, () -> arrayElementSwapper.swap(testArray, -1, 2));
        assertThrows(IllegalArgumentException.class, () -> arrayElementSwapper.swap(testArray, 2, 7));
        assertArrayEquals(new int[]{5, 2, 6, 10, 9, 3}, testArray);
    }
}
