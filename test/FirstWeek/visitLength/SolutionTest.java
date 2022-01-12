package FirstWeek.visitLength;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	@Test
	public void test() {
		Solution test = new Solution();
		String input1 = "ULURRDLLU";
		String input2 = "LULLLLLLU";

		assertEquals(test.solution(input1), 7);
		assertEquals(test.solution(input2), 7);

	}
}