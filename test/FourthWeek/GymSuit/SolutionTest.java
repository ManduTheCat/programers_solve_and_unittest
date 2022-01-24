package FourthWeek.GymSuit;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
	@Test
	public void test(){
		Solution test = new Solution();
		int n = 8;
		int[] lost ={4,3,7,8};
		int[] reserve = {1,2,3,4,5,7,8};
		assertEquals(8, test.solution(n, lost, reserve));
		int n1 = 5;
		int[] lost1 ={2,4};
		int[] reserve1 = {3};
		assertEquals(4, test.solution(n1, lost1, reserve1));
		int n2 = 3;
		int[] lost2 ={1,2};
		int[] reserve2 = {2,3};
		assertEquals(2, test.solution(n2, lost2, reserve2));
		int n3 = 12;
		int[] lost3 ={1,2,3,4,8,9,10,11};
		int[] reserve3 = {9,10};
		assertEquals(6, test.solution(n3, lost3, reserve3));
		int n4 = 10;
		int[] lost4 ={5,7,9};
		int[] reserve4 = {1,2,3,4,6,8};
		assertEquals(10, test.solution(n4, lost4, reserve4));
		int n5 = 5;
		int[] lost5 ={1,2,4,5};
		int[] reserve5 = {2,3,4};
		assertEquals(3, test.solution(n5, lost5, reserve5));
		int n6 = 5;
		int[] lost6 ={3};
		int[] reserve6 = {2,3};
		assertEquals(5, test.solution(n6, lost6, reserve6));
		int n7 = 5;
		int[] lost7 ={3};
		int[] reserve7 = {3,4};
		assertEquals(5, test.solution(n7, lost7, reserve7));
		int n8 = 3;
		int[] lost8 ={3};
		int[] reserve8 = {3};
		assertEquals(3, test.solution(n8, lost8, reserve8));
	}
	@Test
	public void beforTest(){

		Solution test = new Solution();
		int n1 = 5;
		int[] lost1 = {2,4};
		int[]  revers1 = {1,3,5};

		int[] lost2 = {2,4};
		int[]  revers2 = {3};

		int n3 = 3;
		int[] lost3 = {3};
		int[]  revers3 = {1};

		int n4 = 6;
		int[] lost4 ={5,6};
		int[] revers4 = {1,2,3};

		int n5 = 6;
		int[] lost5 ={5,6};
		int[] revers5 = {1};

		int n6 = 3;
		int[] lost6 ={1,2};
		int[] revers6 = {1,2};

		int n7 = 4;
		int[] lost7 ={2};
		int[] revers7 = {3};

		assertEquals(5,test.solution(n1, lost1, revers1));
		assertEquals(4,test.solution(n1, lost2, revers2));
		assertEquals(2, test.solution(n3, lost3, revers3));
		assertEquals(4, test.solution(n4, lost4, revers4));
		assertEquals(4, test.solution(n5, lost5, revers5));
		assertEquals(3, test.solution(n6, lost6, revers6));
		assertEquals(4,test.solution(n7, lost7, revers7));
	}

}