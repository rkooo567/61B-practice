import org.junit.Test;

public class TestSort {
    /** Tests the sort method of the Sort class. */
    @Test
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);
        String[] input2 = {"it", "is", "good", "to", "see", "you"};
        String[] expected2 = {"good", "is", "it", "see", "to", "you"};
        Sort.sort(input2);
        org.junit.Assert.assertArrayEquals(expected2, input2);
    }

    public static void main(String[] args) {
        testSort();
    }
}