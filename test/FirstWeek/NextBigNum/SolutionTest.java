package FirstWeek.NextBigNum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
	@Test
	public void test(){
		Solution1 test = new Solution1();
		assertEquals(test.solution(78),83 );
		assertEquals(test.solution(15),23 );
	}

}