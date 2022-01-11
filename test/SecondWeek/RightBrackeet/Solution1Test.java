package SecondWeek.RightBrackeet;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

	@Test
	public void solution() {
		Solution1 test1 = new Solution1();
		assertFalse(test1.solution("(()))"));
		assertTrue(test1.solution("(())()"));

	}
}