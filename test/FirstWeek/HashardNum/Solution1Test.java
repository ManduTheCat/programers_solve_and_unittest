package FirstWeek.HashardNum;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void solution() {
        Solution1 test = new Solution1();
        assertTrue(test.Solution(10));
        assertTrue(test.Solution(12));
        assertFalse(test.Solution(11));
        assertFalse(test.Solution(13));
    }
}