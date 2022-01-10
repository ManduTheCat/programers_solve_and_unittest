package SecondWeek.FinshRunning;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	@Test
	public void test() {
		String []par = {"leo", "kiki", "eden"};
		String []com = {"eden", "kiki"};
		String []par1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String []com1 = {"josipa", "filipa", "marina", "nikola"};
		Solution test = new Solution();
		assertEquals(test.solution(par, com),"leo");
		assertEquals(test.solution(par1, com1),"vinko");

	}
}