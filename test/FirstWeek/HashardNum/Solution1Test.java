package FirstWeek.HashardNum;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void solution() {
        Solution1 test = new Solution1();
        assertTrue(test.solution(10));
        assertTrue(test.solution(12));
        assertFalse(test.solution(11));
        assertFalse(test.solution(13));
    }
}