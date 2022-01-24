package FourthWeek.GymSuit;

public class Main {
	public static void main(String[] args) {
		Solution test = new Solution();
		int n1 = 5;
		int[] lost1 = {1, 2};
		int[]  revers1 = {2, 3};
		System.out.println(test.solution(n1, lost1, revers1));
		testSample();
	}
	public static void testSample(){
		SolutionSample test = new SolutionSample();
		int n1 = 5;
		int[] lost1 = {1, 2};
		int[]  revers1 = {2, 3};
		System.out.println(test.solution(n1, lost1, revers1));
		int n8 = 3;
		int[] lost8 ={3};
		int[] reserve8 = {3};
		System.out.println(test.solution(n8, lost8, reserve8));
		int n7 = 5;
		int[] lost7 ={3};
		int[] reserve7 = {3,4};
		System.out.println(test.solution(n7, lost7, reserve7));
	}
}
